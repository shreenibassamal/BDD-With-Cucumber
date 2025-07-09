Feature: ShoppersStackLogin

Scenario: Validate shooper can login using valid credentials

Given Browser is open and URL navigated
And Login page shoiuld be displayed
And shooper login is displayed
When User enters "qa_testmerchantdell@gmail.com" and "Password@123"
And click on login button
Then Shopper should be successfully logged in
And Browser Must be close

Scenario: Validate Merchant can login using valid credentials

Given Browser is open and URL navigated
And Login page shoiuld be displayed
And Merchant login is displayed
When User enters "qa_merchantlogin@gmail.com" and "Password@123"
And click on login button
Then Merchant should be successfully logged in
And Browser Must be close

Scenario: Validate Admin can login using valid credentials

Given Browser is open and URL navigated
And Login page shoiuld be displayed
And Admin login is displayed
When User enters "qa_testadmindell@gmail.com" and "Password@123"
And click on login button
Then Admin should be successfully logged in
And Browser Must be close


