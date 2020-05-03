Feature: Login into sMARTBEAR APPLICATION

Background:
Given Application is up & running


Scenario: User should be able to click view order panel successfully and shuld fetch price 
When user enter credentials user should be able to login successfully
And user click on view all products panel
Then system should display all products detail
And user should be able to fetch the price from records

