package it.fmelandri.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {
    final Map<Integer, String> matches;

    private FizzBuzz() {
        matches = new LinkedHashMap<>();
    }

    public static FizzBuzz create() {
        return new FizzBuzz();
    }

    public FizzBuzz with(int number, String value) {
        matches.put(number, value);
        return this;
    }

    public String emit(int number) {
        return matches
                .keySet()
                .stream()
                .filter(key -> isDivisibleBy(number, key))
                .map(matches::get)
                .reduce(String::concat)
                .orElse(String.valueOf(number));
    }

    public boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}

