package kata.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzAndNumbers {

    public static void main(String[] args) {
        List<Integer> myListOfRange = new ArrayList<>();
        for ( int i = 1; i <= 100; i++) {
            myListOfRange.add(i);
        }
        fizzBuzzSolution(myListOfRange);
    }
    public static List<String> fizzBuzzSolution(List<Integer> listNumbers){
        List<String> listTransformToString = new ArrayList<>();
        for ( Integer data : listNumbers ) {
            if ( data %3 == 0 && data % 5 == 0) {
                listTransformToString.add("FizzBuzz");
            } else if ( data % 3 == 0) {
                listTransformToString.add("Fizz");
            } else if ( data % 5 == 0) {
                listTransformToString.add("Buzz");
            } else{
                String transformationToString = String.valueOf(data);
                listTransformToString.add(transformationToString);
            }

        }

        return listTransformToString;
    }


}

/*
Funciona pasando una lista de enteros devuelve una lista de String y la pinta en pantalla
public static List<String> fizzBuzzSolution(List<Integer> listNumbers){
        List<String> listTransformToString = new ArrayList<>();
        for ( Integer data : listNumbers ) {
            String transformationToString = String.valueOf(data);
            listTransformToString.add(transformationToString);
        }
        for ( String data : listTransformToString) {
            System.out.println(data);
        }
        return listTransformToString;
    }

Funciona pasando una lista de enteros y devolviendo un String
public static String fizzBuzzSolution(List<Integer> number){
        String resolve = String.valueOf(number.get(0));

        return resolve;
    }

Funciona pasando un entero y devolviendo un String
public static String fizzBuzzSolution(int number){
        String resolve = "1";
        return resolve;
    }
*/