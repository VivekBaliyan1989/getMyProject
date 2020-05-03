Feature: Login

  Scenario: Successful login with valide credentials 
    Given User launch browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enter Email "admin@yourstore.com" and Password "admin"
    And User Click on Login 
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout
    Then Page title should be "Your store. Login"
    And Close browser


	Scenario Outline: Login
		Given User launch browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enter Email "<Email>" and Password "<Password>"
    And User Click on Login 
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout
    Then Page title should be "Your store. Login"
    And Close browser

  Examples:
				|Email|Password|
				|admin@yourstore.com|admin|
				|aPmin@yourstore.com|admin123|