package kata.example;

import java.util.ArrayList;
import java.util.List;

/*
*
* Cambiar nombre a la clase y a la función publica
* Borrar toda la función publica y empezar con TDD desde cero
* Recibe una lista de enteros y devuelve una lista de Strings
* El nombre de los test deben describir su comportamiento no lo que retornan
* Ojo con lo que recibes, debes transformarlo a JSON
*
* Atajos
* Ctrl+Alt+L -> Formatea el código
*
*/
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
    private static List<String> creation_list_of_results(String option){
        List<String> results = new ArrayList<>();
        results.add(option);
        return results;
    }
/*
    public static String fizzBuzz22(int number){
        List<String> results = new ArrayList<>();
        results.add(option);
        return results;
    }
*/



/*
    public static List<String> fizzBuzz(int number){
        List<String> results = new ArrayList<>();
        for (int i=1 ; i < number ; i++){
            results.add(String.valueOf(number));
            if (number % 15 == 0) results.add("FizzBuzz");
            if (number % 3 == 0) results.add("Fizz");
            if (number % 5 == 0) results.add("Buzz");
            results.add(String.valueOf(number));
        }
        return results;
    }
*/
}
