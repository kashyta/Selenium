Feature: Register
 
Scenario Outline: Successful Registration with Valid email id
	Given User is on Home Page
	When User Navigate to SignIn Page
	And User enters "<EmailAddress>" and clicks on CreateAnAccount
	Then User is displayed with Register page
	
	Examples:
	|EmailAddress|
	|abc12367@testautomation.com|