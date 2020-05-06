package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {
    @Test
    void should_return_the_order() {
        Student student = new Student(2);
        assertThat(student.fizzBuzz()).isEqualTo("2");
    }
}
