package com.westpacnz.primenumbercalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PrimeNumberCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumberCalculatorApplication.class, args);
	}

}
