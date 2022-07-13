package com.westpacnz.primenumbercalculator;

import com.westpacnz.primenumbercalculator.service.CalculatorService;
import com.westpacnz.primenumbercalculator.util.NumberUtil;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class CalculatorServiceTest {

	@InjectMocks
	private CalculatorService calculatorService;

	@Test
	void getPrimeNumberSum_givenCorrectArgs_returnPrimeSum() {
		// the numbers added within expectedVal are the prime numbers before 10
		Long expectedVal = 2L + 3L + 5L + 7L;
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(1L,10L));
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(2L,10L));
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(2L,7L));

		// 11 is a prime number
		expectedVal += 11L;
		assertEquals(expectedVal, calculatorService.getPrimeNumberSum(1L,11L));

		// test with bigger figures
		assertEquals(Long.valueOf(24133), calculatorService.getPrimeNumberSum(1L,542L));
		assertEquals(Long.valueOf(76127), calculatorService.getPrimeNumberSum(1L,1000L));
	}

	@Test
	void getPrimeNumberSum_givenIncorrectArgs_return0() {
		// startNum is greater than endNum
		assertEquals(Long.valueOf(0), calculatorService.getPrimeNumberSum(10L,9L));
		// startNum is null
		assertEquals(Long.valueOf(0), calculatorService.getPrimeNumberSum(null,9L));
		// endNum is null
		assertEquals(Long.valueOf(0), calculatorService.getPrimeNumberSum(6L,null));
	}

}
