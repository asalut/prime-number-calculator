package com.westpacnz.primenumbercalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer getPrimeNumberSum(Integer startNum, Integer endNum) {
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
    public boolean isPrime(Integer thisNum) {
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

    public Integer getPrimeNumberSumTo10M(Integer startNum) {
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        return getPrimeNumberSum(startNum, 100);
    }
}
