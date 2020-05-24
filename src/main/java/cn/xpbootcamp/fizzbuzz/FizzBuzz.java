package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String getCount(int order) {
        String countString = "";
        if (order % 3 == 0) {
            countString = countString + "Fizz";
        }
        if (order % 5 == 0) {
            countString = countString + "Buzz";
        }
        if (order % 7 == 0) {
            return "Whizz";
        }
        if (countString.isEmpty()) {
            return Integer.toString(order);
        }
        return countString;
    }
}
