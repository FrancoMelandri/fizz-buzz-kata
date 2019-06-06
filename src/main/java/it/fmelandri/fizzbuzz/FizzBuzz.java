package it.fmelandri.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FizzBuzz {
    Map<Integer, String> matches = new HashMap<>();


    public static FizzBuzz create() {
        return new FizzBuzz();
    }


    public String emit(int number) {
        return matches
                .keySet()
                .stream()
                .filter(key -> number % key == 0)
                .map(key -> Optional.ofNullable(matches.get(key)))
                .reduce(Optional.ofNullable(null),
                        (acc, item) -> Optional.ofNullable(acc.orElse("") + item.orElse("")))
                .orElse(String.valueOf(number));
    }

    public FizzBuzz with(int number, String value) {
        matches.put(number, value);
        return this;
    }
}
