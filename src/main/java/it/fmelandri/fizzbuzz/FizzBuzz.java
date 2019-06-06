package it.fmelandri.fizzbuzz;

public class FizzBuzz {
    public String emit(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "fizz";
        if (number % 5 == 0)
            result += "buzz";
        if (result.isEmpty())
            return String.valueOf(number);
        return result;
    }
}
