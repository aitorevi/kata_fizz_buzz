package kata.example;

public class FizzBuzzTDD  {

    public static String fizzBuzz(int number){
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

}
