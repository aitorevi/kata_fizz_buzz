package kata.example;

public class FizzBuzzWithFunctions {

    public static void main(String[] args) {
        fizzBuzz(100);
    }
    public static void fizzBuzz(int number) {
        for ( int i=1 ; i <= number ; i++) {
            if (multiplo_of_fifteen(i)) {
                System.out.println("fizzbuzz");
            } else if (multiplo_of_three(i)) {
                System.out.println("fizz");
            } else if (multiplo_of_five(i)) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    static boolean multiplo_of_three(int number){  // Porque me dice que debo hacerlo estatico?
        boolean result = number % 3 == 0;
        return result;
    }
    static boolean multiplo_of_five(int number){  // Porque me dice que debo hacerlo estatico?
        boolean result = number % 5 == 0;
        return result;
    }
    static boolean multiplo_of_fifteen(int number){  // Porque me dice que debo hacerlo estatico?
        boolean result = number % 15 == 0;
        return result;
    }
}
