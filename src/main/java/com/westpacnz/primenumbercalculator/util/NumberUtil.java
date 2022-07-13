package com.westpacnz.primenumbercalculator.util;

public class NumberUtil {

    public static boolean isPrime(Long thisNum) {
        // 2 is the smallest and only even prime number
        // all other numbers divisible by other than 1 are not prime numbers
        if (thisNum != null
                && thisNum > 1) {
            System.out.println("Checking if " + thisNum + " is a prime number. Stops checking at " + thisNum / 2);
            for (int i = 2; i <= (thisNum / 2); i++) {
                if (thisNum % i == 0) {
                    return false;
                }
            }
            // the number is declared prime at this point,
            // as no number until half of thisNum served as a whole divisor other than 1
            return true;
        }
        return false;
    }
}
