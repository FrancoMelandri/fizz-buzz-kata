package it.fmelandri.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldShowNumberOne() {
        FizzBuzz sut = new FizzBuzz();
        assertThat(sut.emit(1)).isEqualTo("1");
    }
}
