package kata.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * [1] -> ["1"] *
 * 3 -> Fizz *
 * 5 -> Buzz *
 * 15 -> FizzBuzz
 * number % 3 == 0 -> Fizz
 * number % 5 == 0 -> Buzz
 * number % 15 == 0 -> FizzBuzz
 *
 * Cambiar nombre a la clase y a la función publica
 * Borrar toda la función publica y empezar con TDD desde cero
 * Recibe una lista de enteros y devuelve una lista de Strings
 * El nombre de los test deben describir su comportamiento no lo que retornan
 *
 * crear la iteración
 * crear lista donde guardar los resultados obtenidos en la iteración
 */

public class FizzBuzzAndNumbersTest {

    @Test
    void notMultiplo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        assertEquals(expected, FizzBuzzAndNumbers.fizzBuzzSolution(list));
    }

    @Test
    void multiploOfThree(){
        List<Integer> list = new ArrayList<>();
        list.add(9);
        List<String> expected = new ArrayList<>();
        expected.add("Fizz");
        assertEquals(expected, FizzBuzzAndNumbers.fizzBuzzSolution(list));
    }

    @Test
    void multiploOfFive(){
        List<Integer> list = new ArrayList<>();
        list.add(25);
        List<String> expected = new ArrayList<>();
        expected.add("Buzz");
        assertEquals(expected, FizzBuzzAndNumbers.fizzBuzzSolution(list));
    }

    @Test
    void multiploOfThreeAndFive() {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        List<String> expected = new ArrayList<>();
        expected.add("FizzBuzz");
        assertEquals(expected, FizzBuzzAndNumbers.fizzBuzzSolution(list));
    }
}
