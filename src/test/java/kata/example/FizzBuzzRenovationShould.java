package kata.example;

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
 * Borrar toda la función pública y empezar con TDD desde cero
 * Recibe una lista de enteros y devuelve una lista de Strings
 * El nombre de los test deben describir su comportamiento no lo que retornan
 *
 * crear la iteración
 * crear lista donde guardar los resultados obtenidos en la iteración
 */

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzRenovationShould {

    @Test
    void be_number() {
        assertEquals(List.of("1", "2", "4", "7"), FizzBuzzRenovation.fizz_buzz(List.of(1, 2, 4, 7)));
    }

    @Test
    void be_fizz() {
        assertEquals(List.of("Fizz"), FizzBuzzRenovation.fizz_buzz(List.of(3)));

    }

    @Test
    void be_buzz() {
        assertEquals(List.of("Buzz"), FizzBuzzRenovation.fizz_buzz(List.of(5)));
    }

    @Test
    void be_fizzbuzz() {
        assertEquals(List.of("FizzBuzz"), FizzBuzzRenovation.fizz_buzz(List.of(15)));
    }

    @Test
    void be_fizzbuzz_with_numbers_and_words() {
        assertEquals(List.of("2","Fizz","Buzz","FizzBuzz"), FizzBuzzRenovation.fizz_buzz(List.of(2,3,5,15)));
    }
}
