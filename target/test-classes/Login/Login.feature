Feature: Checking RahulShetty app for login

Scenario: Validating login page

Given Navigate to login page
#When is used to perfore action followed by AND
When Enter username
And Enter password
And click on login

#THEN is used to verify 
Then HomePage should be displayed

Scenario: Validating with negative inputs

Given Navigate to login page

When Enter Invalidusername
And Enter Invalidpassword

Then Error message should display