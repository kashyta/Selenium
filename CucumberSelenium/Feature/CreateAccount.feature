Feature: Create Account 

Scenario Outline: 
	Given User is on Home Page 
	When User Navigate to SignIn Page 
	And User enters "<EmailAddress>" and clicks on CreateAnAccount 
	Then User is displayed with Register page 
	And User selects Title
	And User enters "<FirstName>" and "<LastName>" 
	Then User verifies EmailAddress
	And User enters "<Password>"
	Then User enters DOB
	And User enters Address and Additional Information
	And User clicks on Register
	
	
	Examples: 
		|EmailAddress	    |Title  |FirstName|LastName|Password   |
		|qwerty1236789@comp.com |Mr.	   |Qazws    |Edcvfr  |Qwerty!@123|
