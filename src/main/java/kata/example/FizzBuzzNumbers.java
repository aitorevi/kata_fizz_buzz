package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzNumbers {

    public static void main(String[] args) {
        List<Integer> myListOfRange = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myListOfRange.add(i);
        }
        showScreenFizzbuzz(fizzBuzzResolve(myListOfRange));
    }

    public static List<String> fizzBuzzResolve(List<Integer> list_numbers) {
        List<String> list_resolve = new ArrayList<>();
        for (Integer number : list_numbers) {
            list_resolve.add(fizzbuzzTransformation(number));
        }
        return list_resolve;
    }

    public static String fizzbuzzTransformation(Integer number) {
        if (notMultipleOfThreeAndFive(number)) {
            return number.toString();
        }
        if (notMultipleOfThree(number)) {
            return "Buzz";
        }
        if (notMultipleOfFive(number)) {
            return "Fizz";
        }
        return "FizzBuzz";
    }

    public static boolean notMultipleOfThree(Integer number) {
        return number % 3 != 0;
    }

    public static boolean notMultipleOfFive(Integer number) {
        return number % 5 == 0;
    }

    public static boolean notMultipleOfThreeAndFive(Integer number) {
        return number % 3 != 0 && number % 5 != 0;
    }

    public static void showScreenFizzbuzz(List<String> solution_list){
        for (String word_or_number:solution_list) {
            System.out.println(word_or_number);
        }
    }
}