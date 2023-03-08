package kata.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * 1 -> 1 *
 * 3 -> Fizz *
 * 5 -> Buzz *
 * 15 -> FizzBuzz
 * number % 3 == 0 -> Fizz
 * number % 5 == 0 -> Buzz
 * number % 15 == 0 -> FizzBuzz
 */

public class FizzBuzzTDDTest {
    @Test
    void should_return_one_when_it_is_one() {
        assertEquals("1",FizzBuzzTDD.fizzBuzz(1));
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
    @Test
    void should_return_Fizz_when_it_is_multiplo_of_three() {
        assertEquals("Fizz",FizzBuzzTDD.fizzBuzz(9));
    }

    @Test
    void should_return_Fizz_when_it_is_multiplo_of_five() {
        assertEquals("Buzz",FizzBuzzTDD.fizzBuzz(10));
    }

    @Test
    void should_return_Fizz_when_it_is_multiplo_of_three_and_five() {
        assertEquals("FizzBuzz",FizzBuzzTDD.fizzBuzz(30));
    }

}
