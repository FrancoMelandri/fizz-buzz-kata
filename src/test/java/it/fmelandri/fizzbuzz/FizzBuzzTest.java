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

    @Test
    public void shouldShowNumberThreeAsFizz() {
        assertThat(sut.emit(3)).isEqualTo("fizz");
    }

    @Test
    public void shouldShowNumberFiveAsBuzz() {
        assertThat(sut.emit(5)).isEqualTo("buzz");
    }
}
