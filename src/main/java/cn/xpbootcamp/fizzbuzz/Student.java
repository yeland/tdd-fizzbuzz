package cn.xpbootcamp.fizzbuzz;

public class Student {
    private final int order;

    public Student(int order) {
        this.order = order;
    }

    public String fizzBuzz() {
        if (order % 3 == 0) {
            return "Fizz";
        }

        if (order % 5 == 0) {
            return "Buzz";
        }

        if (order % 7 == 0) {
            return "Whizz";
        }

        return Integer.toString(order);
    }
}
