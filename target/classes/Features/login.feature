Feature: Login Feature


Scenario: Login Test Scenario
Given user is on login page
When title of login "testdata"
Then verify Home page title
Then verify Home page text


Scenario Outline: Login Test Scenario

Given user is on login page
When title of login "<testdata>"
Then verify Home page title
Then verify Home page text

Examples:
	| testdata |
	| tom |
	| ravi |