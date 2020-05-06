package cn.xpbootcamp.fizzbuzz;

public class Student {
    private final int order;

    public Student(int order) {
        this.order = order;
    }

    public String fizzBuzz() {
        return Integer.toString(order);
    }
}
