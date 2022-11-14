Feature: Login Validation
Scenario: Verify FACEBOOK login
Given user is in the FACEBOOK page
When user enters USER ID as "afrinsafa7865"
And user enters password as "1234"
Then user should be navigated to login page 