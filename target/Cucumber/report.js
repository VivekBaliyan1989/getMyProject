$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Create new customer",
  "description": "",
  "id": "create-new-customer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valide credentials",
  "description": "",
  "id": "create-new-customer;successful-login-with-valide-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter Email \"admin@yourstore.com\" and Password \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can view Dashbord",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on customers menu item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User can view add new customers page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User can view conformation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerPageSteps.user_launch_browser()"
});
formatter.result({
  "duration": 6640087900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "CustomerPageSteps.user_opens_URL(String)"
});
formatter.result({
  "duration": 6922494500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 18
    },
    {
      "val": "admin",
      "offset": 53
    }
  ],
  "location": "CustomerPageSteps.user_Enter_Email_and_Password(String,String)"
});
formatter.result({
  "duration": 284142900,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.user_Click_on_Login()"
});
formatter.result({
  "duration": 8046294200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.user_can_view_Dashbord()"
});
formatter.result({
  "duration": 71001300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 70844300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.click_on_customers_menu_item()"
});
formatter.result({
  "duration": 1743925100,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 1691058700,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.user_can_view_add_new_customers_page()"
});
formatter.result({
  "duration": 17487700,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.user_enter_customer_info()"
});
formatter.result({
  "duration": 1484211200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.click_on_Save_button()"
});
formatter.result({
  "duration": 1961375100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully",
      "offset": 36
    }
  ],
  "location": "CustomerPageSteps.user_can_view_conformation_message(String)"
});
formatter.result({
  "duration": 215651000,
  "status": "passed"
});
formatter.match({
  "location": "CustomerPageSteps.close_browser()"
});
formatter.result({
  "duration": 711385400,
  "status": "passed"
});
});