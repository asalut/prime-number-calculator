package com.westpacnz.primenumbercalculator.controller;

import com.westpacnz.primenumbercalculator.service.CalculatorService;
import com.westpacnz.primenumbercalculator.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prime-number")
public class PrimeNumberController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum-10m")
    public ResponseEntity<Object> getSumOfPrimeNumbers10M(
        @RequestParam(required = false) String startNum
    ) {
        Long startWith = 0L;
        if (startNum != null) {
            if (!NumberUtil.isNaturalNumber(StringUtils.trimAllWhitespace(startNum))) {
                return ResponseEntity.badRequest().body("Invalid startNum value");
            }
            startWith = Long.valueOf(StringUtils.trimAllWhitespace(startNum));
            if (startWith > 10000000) {
                // startNum must not exceed 10 million
                return ResponseEntity.badRequest().body("startNum value must not exceed ten million");
            }
        } else {
            // if startNum is not set, use '2' as default - being the lowest prime number
            startWith = 2L;
        }
        return ResponseEntity.ok(calculatorService.getPrimeNumberSum10M(startWith));
    }

    // primarily added for testing adding of prime numbers within a given range
    @GetMapping("/sum-between")
    public ResponseEntity<Object> getSumOfPrimeNumbersBetween(
            @RequestParam Long startNum,
            @RequestParam Long endNum
    ) {
        return ResponseEntity.ok(calculatorService.getPrimeNumberSum(startNum, endNum));
    }
}
