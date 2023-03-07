package kata.example;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

// Font: https://linuxtut.com/en/4eb551077595605d5e2e/

public class FizzBuzzWithObjects {
    public static void main(String[] args) {
        Operator operator = new Operator();

        Predicate<Integer> divisibleBy3 = DivisiblePredicateFactory.divisibleBy(3);
        Predicate<Integer> divisibleBy5 = DivisiblePredicateFactory.divisibleBy(5);

        Operation fizzbuzz = new Operation(new Specification(divisibleBy3).and(divisibleBy5), "FizzBuzz");
        Operation fizz = new Operation(new Specification(divisibleBy3), "Fizz");
        Operation buzz = new Operation(new Specification(divisibleBy5), "Buzz");

        operator.addOperation(fizzbuzz);
        operator.addOperation(fizz);
        operator.addOperation(buzz);

        operator.run(IntStream.rangeClosed(1, 100));
    }
}
class Operation {

    private final Specification specification;
    private final String message;

    Operation(Specification specification, String message) {
        this.specification = specification;
        this.message = message;
    }

    public Specification getSpecification() {
        return this.specification;
    }

    public String getMessage() {
        return message;
    }
}

class Operator {

    private final List<Operation> operationList = new ArrayList<>();

    public void addOperation(Operation operation) {
        this.operationList.add(operation);
    }

    public void run(IntStream range) {
        range.forEach(number -> {
            String message = this.operationList.stream()
                    .filter(operation -> operation.getSpecification().isSatisfiedBy(number))
                    .map(Operation::getMessage)
                    .findFirst()
                    .orElse(String.valueOf(number));
            System.out.println(message);
        });
    }
}

class DivisiblePredicateFactory {

    public static Predicate<Integer> divisibleBy(Integer divisor) {
        return n -> n % divisor == 0;
    }

}

class Specification {

    private List<Predicate<Integer>> predicateList = new ArrayList<>();

    public Specification(Predicate<Integer> predicate) {
        this.predicateList.add(predicate);
    }

    private Specification(List<Predicate<Integer>> predicateList) {
        this.predicateList = predicateList;
    }

    public Specification and(Predicate<Integer> predicate) {
        List<Predicate<Integer>> results = new ArrayList<>(this.predicateList);
        results.add(predicate);
        return new Specification(results);
    }

    public boolean isSatisfiedBy(Integer number) {
        return this.predicateList.stream().allMatch(p -> p.test(number));
    }

}

