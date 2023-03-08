package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTDD  {

    public static String fizzBuzz(int number){
        if (number % 15 == 0)
            return creation_list_of_results("FizzBuzz").get(0);
        if (number % 3 == 0)
            return creation_list_of_results("Fizz").get(0);
        if (number % 5 == 0)
            return creation_list_of_results("Buzz").get(0);
        return creation_list_of_results(String.valueOf(number)).get(0);
    }
    public static List<String> creation_list_of_results(String option){
        List<String> results = new ArrayList<>();
        results.add(option);
        return results;
    }

}
