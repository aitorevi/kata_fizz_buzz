package kata.example;

public class FizzBuzzWithTernaryOperator {

    public static void main(String[] args) {
        fizzBuzz(100);
    }
    public static void fizzBuzz(int number) {
        for ( int i=1 ; i <= number ; i++) {
            System.out.println(
                   (i % 15 == 0) ? "fizzbuzz" :
                   (i % 3 == 0) ? "fizz" :
                   (i % 5 == 0) ? "buzz" :
                    i);
        }
    }
}
