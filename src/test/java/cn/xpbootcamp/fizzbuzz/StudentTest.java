package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {
    @Test
    void should_return_the_order() {
        Student student = new Student(2);
        assertThat(student.fizzBuzz()).isEqualTo("2");
    }

    @Test
    void should_return_special_words_when_it_is_one_number_multiple() {
        Student student1 = new Student(3);
        assertThat(student1.fizzBuzz()).isEqualTo("Fizz");

        Student student2 = new Student(5);
        assertThat(student2.fizzBuzz()).isEqualTo("Buzz");

        Student student3 = new Student(7);
        assertThat(student3.fizzBuzz()).isEqualTo("Whizz");
    }
}
