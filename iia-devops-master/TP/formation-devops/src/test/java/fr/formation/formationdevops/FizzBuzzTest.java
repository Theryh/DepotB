package fr.formation.formationdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    void shouldReturn1When1() {
        Assertions.assertEquals("1", fizzBuzz.process(1, 1));
    }

    @Test
    void shouldReturn2When2() {
        Assertions.assertEquals("2", fizzBuzz.process(2, 2));
    }

    @Test
    void shouldReturnFizzWhen3() {
        Assertions.assertEquals("Fizz", fizzBuzz.process(3, 3));
    }

    @Test
    void shouldReturnFizzWhen6() {
        Assertions.assertEquals("Fizz", fizzBuzz.process(6, 6));
    }

    @Test
    void shouldReturnBuzzWhen5() {
        Assertions.assertEquals("Buzz", fizzBuzz.process(5, 5));
    }

    @Test
    void shouldReturnBuzzWhen10() {
        Assertions.assertEquals("Buzz", fizzBuzz.process(10, 10));
    }

    @Test
    void shouldReturnFizzBuzzWhen15() {
        Assertions.assertEquals("FizzBuzz", fizzBuzz.process(15, 15));
    }

    @Test
    void shouldReturnFizzBuzzWhen30() {
        Assertions.assertEquals("FizzBuzz", fizzBuzz.process(30, 30));
    }

    @Test
    void shouldReturn12FizzWhen1To3() {
        Assertions.assertEquals("12Fizz", fizzBuzz.process(1, 3));
    }

    @Test
    void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzWhen1To15() {
        Assertions.assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", fizzBuzz.process(1, 15));
    }

}
