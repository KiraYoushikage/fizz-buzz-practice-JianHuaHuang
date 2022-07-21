package tdd.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_say_Fizz_when_counOff_given_3() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String res=fizzBuzz.countOff(3);
        //then
        Assertions.assertEquals("Fizz",res);
    }

}
