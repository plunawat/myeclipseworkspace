Feature: Calculator
 
Scenario: Two Number addition
	Given User is accessing add api for calculator
	When user provides 100 and 200
	Then addition of two number is returned