package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {
    @Test
    void should_say_2_when_count_given_the_number_is_not_a_multiple_of_3_5_7() {
        Student student = new Student(2);
        assertThat(student.fizzBuzz()).isEqualTo("2");
    }

    @Test
    void should_say_Fizz_when_count_given_the_number_is_a_multiple_of_3() {
        Student student1 = new Student(3);
        assertThat(student1.fizzBuzz()).isEqualTo("Fizz");
    }

    @Test
    void should_say_Buzz_when_count_given_the_number_is_a_multiple_of_5() {
        Student student2 = new Student(5);
        assertThat(student2.fizzBuzz()).isEqualTo("Buzz");
    }

    @Test
    void should_say_Whizz_when_count_given_the_number_is_a_multiple_of_7() {
        Student student3 = new Student(7);
        assertThat(student3.fizzBuzz()).isEqualTo("Whizz");
    }

    @Test
    void should_say_FizzBuzz_when_count_given_the_number_is_a_multiple_of_3_5() {
        Student student1 = new Student(15);
        assertThat(student1.fizzBuzz()).isEqualTo("FizzBuzz");
    }

    @Test
    void should_say_FizzWhizz_when_count_given_the_number_is_a_multiple_of_3_7() {
        Student student2 = new Student(21);
        assertThat(student2.fizzBuzz()).isEqualTo("FizzWhizz");
    }

    @Test
    void should_say_BuzzWhizz_when_count_given_the_number_is_a_multiple_of_5_7() {
        Student student3 = new Student(35);
        assertThat(student3.fizzBuzz()).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_say_FizzBuzzWhizz_when_count_given_the_number_is_a_multiple_of_3_5_7() {
        Student student = new Student(105);
        assertThat(student.fizzBuzz()).isEqualTo("FizzBuzzWhizz");
    }
}
