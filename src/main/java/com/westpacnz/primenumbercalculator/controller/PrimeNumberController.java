package com.westpacnz.primenumbercalculator.controller;

import com.westpacnz.primenumbercalculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prime-number")
public class PrimeNumberController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum-10m")
    public ResponseEntity<Object> getSumOfPrimeNumbers(
        @RequestParam(required = false) Integer startNum
    ) {
        if (startNum != null) {
            // TODO: add checking
        } else {
            // if startNum is not set, use '2' as default
            startNum = 2;
        }

        return ResponseEntity.ok(calculatorService.getPrimeNumberSumTo10M(startNum));
    }
}
