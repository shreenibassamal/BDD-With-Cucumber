Feature: Login

Scenario:
  Validate user is able to login using valid credentials
  
  Given Browser is open and URL is navigated
  And Login page is displayed
  When user enters valid useranme and valid password
  And user clicks on login button
  Then User should be successfully logedin
  And Browser should be close