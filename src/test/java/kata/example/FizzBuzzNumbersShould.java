package kata.example;

import org.junit.jupiter.api.Test;

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

public class FizzBuzzNumbersShould {

    @Test
    void not_be_fizzbuzz() {
        assertEquals(List.of("1", "2"), FizzBuzzNumbers.fizzBuzzResolve(List.of(1, 2))); }

    @Test
    void be_fizz() {
        assertEquals(List.of("Fizz"), FizzBuzzNumbers.fizzBuzzResolve(List.of(9)));
    }

    @Test
    void be_buzz() {
        assertEquals(List.of("Buzz"), FizzBuzzNumbers.fizzBuzzResolve(List.of(5)));
    }

    @Test
    void be_fizzbuzz() {
        assertEquals(List.of("FizzBuzz"), FizzBuzzNumbers.fizzBuzzResolve(List.of(15)));
    }
}
