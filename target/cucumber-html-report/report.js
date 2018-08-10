$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/JavaProject/com.test.cucumber/src/test/java/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 22,
  "name": "Free CRM login test",
  "description": "",
  "id": "free-crm-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "user login with valid username and password",
  "description": "",
  "id": "free-crm-login-test;user-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user is already in  login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 8190194820,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 14926539,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_enters_username_and_password()"
});
formatter.result({
  "duration": 324690752,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2632866102,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 9880544,
  "status": "passed"
});
});