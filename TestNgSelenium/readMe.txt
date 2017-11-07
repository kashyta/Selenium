TestNgSelenium - An automation flow to register an email id and create an
account for login into a web application using TestNG framework.

System Requirement:
    TestNg plugin
    Selenium 
    Junit
    JDK
    Chrome driver exe file to run test on Goggle chrome
    Gecko Driver exe file to run test on firefox 

Create a java project, configure build path and setup external jar files

Create a TestNg class and select the required annotations
    @BeforeMethod : Launch browser and direct it to the Base URL
    @Test 		  : Enter test data to register email and create account
    @AfterMethod  : Close browser

Run the test as TestNG test and check result in TestNg Result window.

TestNg generates HTML reports and can be found in test output folder in project directory
