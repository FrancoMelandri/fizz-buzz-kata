package it.fmelandri.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    FizzBuzz sut;

    @Before
    public void SetUp() {
        sut = FizzBuzz
                .create()
                    .with(3, "fizz")
                    .with(5, "buzz")
                    .with(7, "razz");
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

    @Test
    public void shouldShowNumberFiveBuzz() {
        assertThat(sut.emit(3*5)).isEqualTo("fizzbuzz");
    }

    @Test
    public void shouldShowNumberFizzBuzzRazz() {
        assertThat(sut.emit(3*5*7)).isEqualTo("fizzbuzzrazz");
    }

    @Test
    public void shouldPreserveOrderOfInsertion() {
        FizzBuzz scrambledSut = FizzBuzz
                .create()
                    .with(7, "First")
                    .with(10, "Second")
                    .with(4, "Third");

        assertThat(scrambledSut.emit(7 * 10 * 4)).isEqualTo("FirstSecondThird");
    }
}
