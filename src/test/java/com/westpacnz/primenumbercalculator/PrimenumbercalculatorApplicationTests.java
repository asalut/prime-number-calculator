package com.westpacnz.primenumbercalculator;

import com.westpacnz.primenumbercalculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class PrimenumbercalculatorApplicationTests {

	@InjectMocks
	private CalculatorService calculatorService;

	@Test
	void isPrime_givenNullValue_returnFalse() {
		assertFalse(calculatorService.isPrime(null));
	}

	@Test
	void isPrime_givenBasePrimeNumbers_returnTrue() {
		assertTrue(calculatorService.isPrime(2));
		assertTrue(calculatorService.isPrime(3));
		assertTrue(calculatorService.isPrime(5));
		assertTrue(calculatorService.isPrime(7));
	}

	@Test
	void isPrime_givenNonPrime_returnFalse() {
		assertFalse(calculatorService.isPrime(1));
		assertFalse(calculatorService.isPrime(0));
		assertFalse(calculatorService.isPrime(4));
		assertFalse(calculatorService.isPrime(10));
	}

	@Test
	void getPrimeNumberSum_givenCorrectArgs_returnPrimeSum() {
		// the numbers added within expectedVal are the prime numbers before 10
		Integer expectedVal = 2 + 3 + 5 + 7;
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(1,10));
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(2,10));
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(2,7));

		// 11 is a prime number
		expectedVal += 11;
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(1,11));
	}

	@Test
	void getPrimeNumberSum_givenIncorrectArgs_return0() {
		// startNum is greater than endNum
		assertEquals(Integer.valueOf(0), calculatorService.getPrimeNumberSum(10,9));
		// startNum is null
		assertEquals(Integer.valueOf(0), calculatorService.getPrimeNumberSum(null,9));
		// endNum is null
		assertEquals(Integer.valueOf(0), calculatorService.getPrimeNumberSum(6,null));
	}

}
