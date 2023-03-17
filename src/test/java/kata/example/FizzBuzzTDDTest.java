package kata.example;

import org.junit.jupiter.api.Test;

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
 * crear la iteración
 * crear lista donde guardar los resultados obtenidos en la iteración
 */

public class FizzBuzzTDDTest {
    @Test
    void oneReturnNumber() {
        assertEquals("1",FizzBuzzTDD.fizzBuzz(1));
       // assertThat(true);
    }

    @Test
    void should_return_Fizz_when_it_is_multiplo_of_three() {
        assertEquals("Fizz",FizzBuzzTDD.fizzBuzz(9));
    }

    @Test
    void should_return_Fizz_when_it_is_multiplo_of_five() {

        assertEquals("Buzz",FizzBuzzTDD.fizzBuzz(10));
    }

    @Test
    void should_return_fizzbuzz_when_it_is_multiplo_of_three_and_five() {
        assertEquals("FizzBuzz",FizzBuzzTDD.fizzBuzz(30));
    }

    @Test
    void should_return_List_of_results_FizzBuzz() {
        assertEquals("FizzBuzz",FizzBuzzTDD.fizzBuzz(30));
    }

        /*
    @Test
    void should_return_Fizz_when_it_is_three() {
        assertEquals("Fizz",FizzBuzzTDD.fizzBuzz(3));
    }

    @Test
    void should_return_Buzz_when_it_is_five() {
        assertEquals("Buzz",FizzBuzzTDD.fizzBuzz(5));
    }

    @Test
    void should_return_FizzBuzz_when_it_is_fifteen() {
        assertEquals("FizzBuzz",FizzBuzzTDD.fizzBuzz(15));
    }
    */


}
