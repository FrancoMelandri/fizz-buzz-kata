package it.fmelandri.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    FizzBuzz sut;

    @Before
    public void SetUp() {
        sut = new FizzBuzz();
    }

    @Test
    public void shouldShowNumberOne() {
        assertThat(sut.emit(1)).isEqualTo("1");
    }

    @Test
    public void shouldShowNumberTwo() {
        assertThat(sut.emit(2)).isEqualTo("2");
    }
}
