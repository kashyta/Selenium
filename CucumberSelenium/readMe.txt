CucumberSelenium  - An automation flow to register an email id and
create an account for login into a web application using BDD framework.

System Requirement:
    Selenium
    Cucumber
    Gherkin
    Junit
    JDK
    Chrome driver exec file

Tasks:
    Java project creation
    Configuration of java build path, addition of external jar files
    Feature file creation - using gherkin and run it as cucumber feature
    Add code to the generated test steps and run the test.

Feature folder  - feature files written in gherkin for user story

Utilities package - Init.java - initialize the browser and launch the application

TestStepDef package - SignInStepDef.java - test scripts to register email
                    - CreateAccountStepDef.java - test scripts to fill in
                      all the required details to create an account
TestRunner package  - RunnerCucumberTest.java - class to run cucumber test

Check test report in target folder
