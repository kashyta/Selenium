
	CucumberSelenium  - Created an automation flow to register an email id and create an account for login into a web application using BDD framework.
	Required jars for:
	Selenium 
	Cucumber
	Gherkin
	Junit
	JDK 
	Chrome driver exec file
	Create a java project
    Configure java build path , add external jar files 
    Create a feature file using gherkin and run it as cucumber feature
    Add code to the generated test steps and run the test.

    Feature folder  - feature files written in gherkin for user story

    utilities package - Init.java - initialize the browser and launch the application
    testStepDef package - SignInStepDef.java - test scripts to register email 
    					- CreateAccountStepDef.java - test scripts to fill in all the required details to create an account
    testRunner package  - RunnerCucumberTest.java	- class to run cucumber test 

    Check test report in target folder.	






This project is about automating the process of email registration and account creation for a web based application.
I have set up selenium webdriver with eclipse and used java for scripting test methods to run the test.
Added all the dependent jar files inorder to run the test and set up java build path.
 driver exec file (chrome driver exec file in this case) inorder to run the test on browser
Basically this flow is about launching a browser remotely and navigating the url to be tested, entering user given values(test data) and creating the account for a user to login
I have used TestNg annotationsn to run my tests for project TestNg Selenium and BDD framework for BDD Selenium which has cucumber as plugin and feature files written in gherkin