package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /* FizzBuzz
           Regeln:
           1. Zahl durch 3 teilbar gib " Fizz"
           2. Zahl durch 5 teilbar gib " Buzz"
           3. Zahl durch 3 UND 5 teilbar gib "FizzBuzz"
           4. Zahl WEDER durch 3 ODER 5 teilbar gib Zahl zurück"
        */

    //RED  - GREEN - REFRACTOR
    @Test
    void fizzBuzz_shouldreturnFizz_whennumberis3()  {

        //given
        String expected ="Fizz";
        int n = 3;
        //when
        String actual = Main.fizzBuzz(n);
        //then
        assertEquals(expected, actual);

    }

@Test
    void fizzBuzz_shouldreturnBuzz_whennumberis5()  {

        //given
        String expected ="Buzz";
        int n = 5;
        //when
        String actual = Main.fizzBuzz(n);
        //then
        assertEquals(expected, actual);

    }

    @Test
    void fizzBuzz_shouldreturnFizzBuzz_whennumberis15()  {

        //given
        String expected ="FizzBuzz";
        int n = 15;
        //when
        String actual = Main.fizzBuzz(n);
        //then
        assertEquals(expected, actual);

    }
}
