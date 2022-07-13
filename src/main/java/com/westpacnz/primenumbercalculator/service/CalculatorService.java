package com.westpacnz.primenumbercalculator.service;

import com.westpacnz.primenumbercalculator.util.NumberUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /**
     * Long is the data type used as sum of prime numbers could exceed the max value of Integer
     * @param startNum
     * @param endNum
     * @return
     */
    public Long getPrimeNumberSum(Long startNum, Long endNum) {
        Long primeNumsSum = 0L;
        Integer primeCounter = 0;
        long startmillis = System.currentTimeMillis();

        // proceed only if endNum is greater than startNum
        if (startNum != null && endNum != null && endNum >= startNum) {
            System.out.println("Getting sum of prime numbers between " + startNum + " and " + endNum);
            // use a while loop till startNum is equal to endNum
            while(endNum >= startNum) {

                // check if startNum is prime
                if (NumberUtil.isPrime(startNum)) {
                    // if so, add value to primeNumsSum; else, simply skip
                    primeNumsSum += startNum;
                    primeCounter++;
                }

                // increment startNum to evaluate the next number
                startNum += 1;
            }
        }
        System.out.println(primeCounter + " prime numbers found, with a summed total of " + primeNumsSum + ". Took " + (System.currentTimeMillis() - startmillis) + " ms");
        return primeNumsSum;
    }

    /**
     * This will calculate the sum of all the prime numbers from the given number up to 10,000,000
     * Uses caching to avoid expensive processing with the same startNum values
     * @param startNum
     * @return
     */
    @Cacheable(value = "sumPrimeNum10M", key = "#startNum")
    public Long getPrimeNumberSum10M(Long startNum) {
        return getPrimeNumberSum(startNum, 10000000L);
    }
}
