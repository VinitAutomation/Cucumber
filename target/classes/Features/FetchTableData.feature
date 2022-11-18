Feature: Fetch Table Data

@SmokeTest
Scenario: Login Test Scenario
Given user is on login page
When title of login testdata
|test1|test2|test3|test4|
|test5|test6|test7|test8|
Then verify Home page title
Then verify Home page text