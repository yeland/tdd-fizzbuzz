package cc.xpbootcamp.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzConverterTest {

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    void should_convert_to_fizz_buzz_when_15_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 12, 18, 21, 99})
    void should_convert_to_fizz_when_3_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 85, 95, 100})
    void should_convert_to_buzz_when_5_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("Buzz");
    }

}
