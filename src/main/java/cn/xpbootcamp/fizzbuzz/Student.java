package cn.xpbootcamp.fizzbuzz;

public class Student {
    private final int order;

    public Student(int order) {
        this.order = order;
    }

    public String fizzBuzz() {
        String words = "";
        if (order % 3 == 0) {
            words += "Fizz";
        }

        if (order % 5 == 0) {
            words += "Buzz";
        }

        if (order % 7 == 0) {
            words += "Whizz";
        }

        if (!words.equals("")) {
            return words;
        } else {
            return Integer.toString(order);
        }
    }
}
