package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

        /* FizzBuzz
        Regeln:
        1. Zahl durch 3 teilbar gib "
        2. Zahl durch 4 teilbar gib "
        3. Zahl durch 5 teilbar gib "
        4. Zahl durch 3 UND 5 teilbar gib "
        5. Zahl WEDER durch 3 ODER 5 teilbar gib "

         */

    //RED  - GREEN - REFRACTOR
    @Test
    void fizzBuzz_shouldReturnfizz_whenGivenNumer_is3() {
        //given
        String expected ="Fizz";
        int n=3;
        //when
        String actual = Main.fizzBuzz(n);
        //then
        assertEquals(expected, actual);


    }
}