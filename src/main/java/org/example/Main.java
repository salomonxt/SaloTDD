package org.example;

public class Main {

        /* FizzBuzz
        Regeln:
        1. Zahl durch 3 teilbar gib " Fizz"
        2. Zahl durch 5 teilbar gib " Buzz"
        3. Zahl durch 3 UND 5 teilbar gib "FizzBuzz"
        4. Zahl WEDER durch 3 ODER 5 teilbar gib Zahl zurück"
        */

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else {
            return "Buzz";
        }
    }
}
