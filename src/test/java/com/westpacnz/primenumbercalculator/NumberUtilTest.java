package com.westpacnz.primenumbercalculator;

import com.westpacnz.primenumbercalculator.util.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilTest {

    @Test
    void isPrime_givenNullValue_returnFalse() {
        assertFalse(NumberUtil.isPrime(null));
    }

    @Test
    void isPrime_givenBasePrimeNumbers_returnTrue() {
        assertTrue(NumberUtil.isPrime(2L));
        assertTrue(NumberUtil.isPrime(3L));
        assertTrue(NumberUtil.isPrime(5L));
        assertTrue(NumberUtil.isPrime(7L));
    }

    @Test
    void isPrime_givenNonPrime_returnFalse() {
        assertFalse(NumberUtil.isPrime(1L));
        assertFalse(NumberUtil.isPrime(0L));
        assertFalse(NumberUtil.isPrime(4L));
        assertFalse(NumberUtil.isPrime(10L));
    }
}
