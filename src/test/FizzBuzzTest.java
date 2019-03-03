package test;

import main.FizzBuzz;
import org.junit.jupiter.api.*;

public class FizzBuzzTest {

    @Test
    public void resultEquals1() {
        Assertions.assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void resultEqualsFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void resultEqualsBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void resultEqualsFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getResult(15));
    }
}
