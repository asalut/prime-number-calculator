# Prime Number Calculator app
The main requirements are as follows:
- Algorithm to sum prime numbers to ten million.
- RESTful API to return the result of the algorithm.
- Instructions to run the application.
- Tests to support your answer.

The definition of a prime numbers:
- A natural number (1, 2, 3, 4, 5, 6, etc.) is called a prime number (or a prime) if it is greater than 1 and cannot be written as the product of two smaller natural numbers.

This app calculates the sum of prime numbers between two numbers, and a similar calculation with fixed upper limit of 10 million.

# API
The below API can be used in getting the sum of prime numbers up to 10,000,000. 
This API can be used without providing any parameter and request body. 
However, the parameter ***startNum*** can be used to set the starting point/number of the calculation.

- ***GET /prime-number/sum-10m***
- ***GET /prime-number/sum-10m?startNum=<insert numeric value>***

# Instructions for running the application
Requirements:
- Installed Java in your machine - version 11 and above
- CLI / Git Bash
- (misc) Postman / browser

Steps:
1. Download the project's generated prime-number-calculator-0.0.1.jar file
- https://github.com/asalut/prime-number-calculator/blob/main/src/main/resources/prime-number-calculator-0.0.1.jar
2. Run the application with the following steps:
- 2.1. Open your CLI / Git Bash
- 2.2. From the CLI, navigate to the directory of the downloaded prime-number-calculator-0.0.1.jar file
- 2.3. Execute the jar file with the following command:
- ***java -jar prime-number-calculator-0.0.1.jar***
3. When the prime-number-calculator application is successfully running, open your Postman or another CLI/Git Bash/browser
4. Access the above API by running the following curl command, or simply transfer the same setup to your Postman, etc...
- curl --request GET "http://localhost:8080/prime-number/sum-10m"
- 4.1 In order to include a parameter to set the desired starting number for the calculation, simply add a ***startNum*** parameter with a numeric natural number value. For example:
- curl --request GET "http://localhost:8080/prime-number/sum-10m?startNum=2"
5. Wait for the response. This could take longer (around 3 seconds) if you didn't enter a startNum value (will get ALL the prime numbers up to 10M) or if you entered a low value 

For checking, this resource could be used to calculate the sum of prime numbers between the given numbers:
- https://allmathsymbols.com/sum-of-prime-calculator/
