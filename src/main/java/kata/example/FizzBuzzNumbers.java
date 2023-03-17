package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzNumbers {

    public static void main(String[] args) {
        List<Integer> myListOfRange = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myListOfRange.add(i);
        }
        show_screen(fizz_buzz_resolve(myListOfRange));
    }

    public static List<String> fizz_buzz_resolve(List<Integer> list_numbers) {
        List<String> list_resolve = new ArrayList<>();
        for (Integer number : list_numbers) {
            if (not_multiple_of_three_and_five(number)) {
                list_resolve.add(number.toString());
                continue;
            }
            if (multiple_of_three(number) && multiple_of_five(number)) {
                list_resolve.add("FizzBuzz");
                continue;
            }
            if (multiple_of_three(number)) {
                list_resolve.add("Fizz");
                continue;
            }
            if (multiple_of_five(number)) {
                list_resolve.add("Buzz");
            }
        }
        return list_resolve;
    }

    public static boolean multiple_of_three(Integer number) {
        return number % 3 == 0;
    }

    public static boolean multiple_of_five(Integer number) {
        return number % 5 == 0;
    }

    public static boolean not_multiple_of_three_and_five(Integer number) {
        return number % 3 != 0 && number % 5 != 0;
    }

    public static void show_screen(List<String> solution_list){
        for (String word_or_number:solution_list) {
            System.out.println(word_or_number);
        }
    }
}