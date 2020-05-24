package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_get_2_when_count_given_number_2_is_not_dividable_by_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.getCount(2));
    }

    @Test
    void should_get_Fizz_when_count_given_number_3_is_dividable_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.getCount(3));
    }

    @Test
    void should_get_Buzz_when_count_given_number_5_is_dividable_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.getCount(5));
    }
}
