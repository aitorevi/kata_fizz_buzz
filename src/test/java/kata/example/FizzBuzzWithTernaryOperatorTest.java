package kata.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWithTernaryOperatorTest {

    @Test
    void shouldReturn1AsIsA() {
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
        if (multiplo_of_three_and_five(input)) {
            return "fizzbuzz";
        }
        if (multiplo_of_three(input)) {
            return "fizz";
        }
        if (multiplo_of_five(input)) {
            return "buzz";
        }
        return String.valueOf(input);
    }

    private boolean multiplo_of_three(int input) {
        return input % 3 == 0;
    }

    private boolean multiplo_of_five(int input) {
        return input % 5 == 0;
    }

    private boolean multiplo_of_three_and_five(int input) {
        return input % 3 == 0 && input % 5 == 0;
    }
}
