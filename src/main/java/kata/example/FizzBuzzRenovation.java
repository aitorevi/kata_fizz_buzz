package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRenovation {

    public static void main(String[] args) {
    }

    public static List<String> fizz_buzz(List<Integer> numbers) {

        List<String> resolve_fizzbuzz = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 15 == 0) {
                resolve_fizzbuzz.add("FizzBuzz");
                continue;
            }
            if (number % 5 == 0) {
                resolve_fizzbuzz.add("Buzz");
                continue;
            }
            if (number % 3 == 0) {
                resolve_fizzbuzz.add("Fizz");
                continue;
            }
            resolve_fizzbuzz.add(number.toString());
        }

        return resolve_fizzbuzz;
    }

}
