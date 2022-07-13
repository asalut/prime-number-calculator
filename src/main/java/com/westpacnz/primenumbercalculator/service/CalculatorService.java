package com.westpacnz.primenumbercalculator.service;

public class CalculatorService {

    public static Integer getPrimeNumberSum(Integer startNum, Integer endNum) {
        Integer primeNumsSum = 0;

        // proceed only if endNum is greater than startNum
        if (startNum != null && endNum != null && endNum >= startNum) {
            // use a while loop till startNum is equal to endNum
            while(endNum >= startNum) {

                // check if startNum is prime
                if (isPrime(startNum)) {
                    // if so, add value to primeNumsSum; else, simply skip
                    primeNumsSum += startNum;
                }

                // increment startNum to evaluate the next number
                startNum += 1;
            }
        }

        return primeNumsSum;
    }

    // TODO: add more checking if necessary
    public static boolean isPrime(Integer thisNum) {
        // 2 is the smallest and only even prime number
        // all other numbers divisible by other than 1 are not prime numbers
        if (thisNum != null
                && thisNum > 1
                && (thisNum.equals(2) || thisNum % 2 != 0)
                && (thisNum.equals(3) || thisNum % 3 != 0)
                && (thisNum.equals(5) || thisNum % 5 != 0)
                && (thisNum.equals(7) || thisNum % 7 != 0)) {
            return true;
        }
        return false;
    }

    public static Integer getPrimeNumberSumTo10M(Integer startNum) {
        return getPrimeNumberSum(startNum, 10000000);
    }
}
