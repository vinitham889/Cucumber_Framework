Feature:
testing the app

#Background used to define a step or series of steps that are common to all the tests in the feature file

Background:
Given Open the browser and go to the login page of rahulsheety

#tagName @positiveTest

@positiveTest

#Scenario Outline: when i want to run one scenario with multiple data
Scenario Outline: To Test Login with valid data
When Enter the valid name "<Name>"
And Enter the valid password "<pwd>"
And Click on loginBtn
Then I should see the username as 

# Examples is used to give inputs we are passing username and pwd in (Enter the valid name "<Name>") method and password
Examples:
|Name|pwd|
|vinitha.m@moolya.com |Rahul@123 |
|vinitha.m@moolya.com |Rahul@123 |
|vinitha.m@moolya.com |Rahul@123 |

@NegativeTest
Scenario: To Test login with invalid data
When Enter invalid name "vinitha"
And Enter invalid password "Vini34"
And Click on loginBtn
Then I should see "Invalid credentials"