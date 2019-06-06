package it.fmelandri.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FizzBuzz {
    Map<Integer, String> matches = new HashMap<>();


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
                .filter(key -> this.isDivisibleBy(number, key))
                .map(this::getKeyFromMatches)
                .map(s -> s.orElse(""))
                .reduce(String::concat)
                .orElse(String.valueOf(number));

    }
    

    public boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public Optional<String> getKeyFromMatches(int key) {
        return Optional.of(matches.get(key));
    }

}

