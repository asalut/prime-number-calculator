package com.westpacnz.primenumbercalculator.util;

import java.util.regex.Pattern;

public class NumberUtil {

    /**
     * Using Primality Test Algorithm for faster iteration
     * @param thisNum
     * @return
     */
    public static boolean isPrime(Long thisNum) {
        // 2 is the smallest and only even prime number, then 3
        if (thisNum == null || thisNum < 2) return false;
        if (thisNum <= 3) return true;
        // all other numbers divisible by other than 1 are not prime numbers
        // if other numbers are divisible by 2 (catches all even numbers) and 3, they aren't prime
        if (thisNum % 2 == 0 || thisNum % 3 == 0) return false;

        long i = 5;
        while(i * i <= thisNum) {
            if (thisNum % i == 0
                    || thisNum % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        // the number is declared prime at this point
        return true;
    }
}
