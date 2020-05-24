package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_get_2_when_count_given_number_2_is_not_dividable_by_3_5_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.getCount(2));
    }
}
