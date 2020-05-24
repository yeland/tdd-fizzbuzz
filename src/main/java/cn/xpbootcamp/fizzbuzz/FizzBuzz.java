package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String getCount(int order) {
        if (order % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(order);
    }
}
