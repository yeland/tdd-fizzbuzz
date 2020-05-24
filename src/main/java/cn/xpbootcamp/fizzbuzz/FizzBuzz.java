package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String getCount(int order) {
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
