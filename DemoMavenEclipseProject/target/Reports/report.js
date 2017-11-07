$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful Registration with Valid email id",
  "description": "",
  "id": "login;successful-registration-with-valid-email-id",
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
  "name": "User enters \"\u003cEmailAddress\u003e\" and clicks on CreateAnAccount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is displayed with Register page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login;successful-registration-with-valid-email-id;",
  "rows": [
    {
      "cells": [
        "EmailAddress"
      ],
      "line": 10,
      "id": "login;successful-registration-with-valid-email-id;;1"
    },
    {
      "cells": [
        "abc123@testautomation.com"
      ],
      "line": 11,
      "id": "login;successful-registration-with-valid-email-id;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Registration with Valid email id",
  "description": "",
  "id": "login;successful-registration-with-valid-email-id;;2",
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
  "name": "User enters \"abc123@testautomation.com\" and clicks on CreateAnAccount",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is displayed with Register page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 5351015361,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_Navigate_to_SignIn_Page()"
});
formatter.result({
  "duration": 2220609964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@testautomation.com",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_and_clicks_on_CreateAnAccount(String)"
});
formatter.result({
  "duration": 314903762,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_displayed_with_Register_page()"
});
formatter.result({
  "duration": 912116458,
  "status": "passed"
});
});