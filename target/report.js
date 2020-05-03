$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/LoginFeaure.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login with valide credentials",
  "description": "",
  "id": "login;successful-login-with-valide-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter Email \"admin@yourstore.com\" and Password \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_browser()"
});
formatter.result({
  "duration": 7588847100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 6080374400,
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
  "location": "Steps.user_Enter_Email_and_Password(String,String)"
});
formatter.result({
  "duration": 284924200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Login()"
});
formatter.result({
  "duration": 11094209400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 99796700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Logout()"
});
formatter.result({
  "duration": 3192091400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 21523200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 672328800,
  "status": "passed"
});
});