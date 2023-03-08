package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTDD  {

    public static String fizzBuzz(int number){
        if (number % 15 == 0) {
            List<String> results = new ArrayList<>();
            results.add("FizzBuzz");
            return results.get(0);
        }
        if (number % 3 == 0) {
            List<String> results = new ArrayList<>();
            results.add("Fizz");
            return results.get(0);
        }
        if (number % 5 == 0) {
            List<String> results = new ArrayList<>();
            results.add("Buzz");
            return results.get(0);
        }
        List<String> results = new ArrayList<>();
        results.add(String.valueOf(number));
        return results.get(0);
    }

    public static List creation_list_of_results(String option){

    }
/*
    public static List list_of_results(FizzBuzzTDD.fizzBuzz(10)) {
        List<String> results = new ArrayList<>();

        return null;
    }

*/
}
