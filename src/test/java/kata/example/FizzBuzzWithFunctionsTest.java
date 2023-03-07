package kata.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWithFunctionsTest {

    @Test
    void shouldReturn1AsIsA() throws Exception {
        assertEquals("1",fizzBuzz(1));
        assertEquals("2",fizzBuzz(2));
        assertEquals("fizz",fizzBuzz(3));
        assertEquals("fizz",fizzBuzz(6));
        assertEquals("fizz",fizzBuzz(9));
        assertEquals("buzz",fizzBuzz(5));
        assertEquals("buzz",fizzBuzz(10));
        assertEquals("fizzbuzz",fizzBuzz(15));
    }

    private String fizzBuzz(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "fizzbuzz";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if (input % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(input);
    }
}
