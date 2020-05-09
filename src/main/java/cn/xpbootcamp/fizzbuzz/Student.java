package cn.xpbootcamp.fizzbuzz;

public class Student {
    private final int number;

    public Student(int number) {
        this.number = number;
    }

    public String fizzBuzz() {
        String words = "";
        if (number % 3 == 0) {
            words += "Fizz";
        }

        if (number % 5 == 0) {
            words += "Buzz";
        }

        if (number % 7 == 0) {
            words += "Whizz";
        }

        if (!words.equals("")) {
            return words;
        } else {
            return Integer.toString(number);
        }
    }
}
