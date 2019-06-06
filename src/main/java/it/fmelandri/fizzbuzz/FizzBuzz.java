package it.fmelandri.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    Map<Integer, String> matches = new HashMap<>();


    public static FizzBuzz create() {
        return new FizzBuzz();
    }


    public String emit(int number) {
        String result = "";
        for (Integer key: matches.keySet()) {
            if (number % key == 0)
                result += matches.get(key);
        }
        if (result.isEmpty())
            return String.valueOf(number);
        return result;
    }

    public FizzBuzz with(int number, String value) {
        matches.put(number, value);
        return this;
    }
}
