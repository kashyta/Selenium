$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful Registration with Valid Credentials",
  "description": "",
  "id": "register;successful-registration-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"EmailAddress\" and clicks on \"CreateAnAccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is displayed with \"Register\" page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "register;successful-registration-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "EmailAddress"
      ],
      "line": 10,
      "id": "register;successful-registration-with-valid-credentials;;1"
    },
    {
      "cells": [
        "abc@testautomation.com"
      ],
      "line": 11,
      "id": "register;successful-registration-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Registration with Valid Credentials",
  "description": "",
  "id": "register;successful-registration-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"EmailAddress\" and clicks on \"CreateAnAccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is displayed with \"Register\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11550460279,
  "status": "passed"
});
formatter.match({
  "location": "SignInStepDef.user_Navigate_to_SignIn_Page()"
});
formatter.result({
  "duration": 4627717706,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EmailAddress",
      "offset": 13
    },
    {
      "val": "CreateAnAccount",
      "offset": 42
    }
  ],
  "location": "SignInStepDef.user_enters_and_clicks_on(String,String)"
});
formatter.result({
  "duration": 1676918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 24
    }
  ],
  "location": "SignInStepDef.user_is_displayed_with_page(String)"
});
formatter.result({
  "duration": 67022,
  "status": "passed"
});
});