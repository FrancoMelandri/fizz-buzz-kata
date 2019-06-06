package it.fmelandri.fizzbuzz;

public class FizzBuzz {
    public String emit(int number) {
        if (number % 3 == 0)
            return "fizz";
        return String.valueOf(number);
    }
}
