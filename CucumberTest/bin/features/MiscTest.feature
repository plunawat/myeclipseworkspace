Feature: Calculator
 
Scenario Outline: Two Number addition
	Given User is accessing add api for calculator
	When user provides <number1> and <number2>
	Then addition of two number is returned

Examples:
    | number1   | number2 |
    | 100 | 200 |