Feature: Login Functinality

Scenario: validate login page with validate credential

Given user is in the login page

When User open chrome browser
When User enter valid username in username field
And User enter valid password in password field 
Then User can navigate to the dashboard page
And close the browser