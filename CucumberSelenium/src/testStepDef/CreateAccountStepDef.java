package testStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import utilities.Init;

public class CreateAccountStepDef extends Init {

	@Then("^User selects Title$")
	public void user_selects_Title() throws Throwable {
		driver.findElement(By.id("id_gender1")).click();
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String FirstName, String LastName) throws Throwable {

		driver.findElement(By.id("customer_firstname")).sendKeys(FirstName);
		driver.findElement(By.id("customer_lastname")).sendKeys(LastName);
	}

	@Then("^User verifies EmailAddress$")
	public void user_verifies_EmailAddress() throws Throwable {
		String email = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(" Email used at the time of Registration " + email);

	}

	@Then("^User enters \"([^\"]*)\"$")
	public void user_enters(String Password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(Password);
	}

	@Then("^User enters DOB$")
	public void user_enters_DOB() throws Throwable {
		Select days = new Select(driver.findElement(By.name("days")));
		days.selectByValue("8");
		Select months = new Select(driver.findElement(By.name("months")));
	months.selectByValue("4");
		Select years = new Select(driver.findElement(By.name("years")));
		years.selectByValue("1988");
	}

	@Then("^User enters Address and Additional Information$")
	public void user_enters_Address_and_Additional_Information() throws Throwable {
		driver.findElement(By.id("firstname")).sendKeys("Abcer");
		driver.findElement(By.id("lastname")).sendKeys("Awsed");
		driver.findElement(By.id("company")).sendKeys("Swxcde");
		driver.findElement(By.id("address1")).sendKeys("2345");
		driver.findElement(By.id("address2")).sendKeys("Qwert Street");
		driver.findElement(By.id("city")).sendKeys("Santa Kilo");
		Select state = new Select(driver.findElement(By.name("id_state")));
		state.selectByVisibleText("California");
		driver.findElement(By.id("postcode")).sendKeys("89346");
		Select country = new Select(driver.findElement(By.name("id_country")));
		country.selectByVisibleText("United States");

		

		driver.findElement(By.id("other")).sendKeys("xedcvfr yhnnmj tyhgfcvb wsddh");
		driver.findElement(By.id("phone")).sendKeys("98723456789");
		driver.findElement(By.id("phone_mobile")).sendKeys("9876543890");
		driver.findElement(By.id("alias")).sendKeys("Home");

	}

	@Then("^User clicks on Register$")
	public void user_clicks_on_Register() throws Throwable {
		
		driver.findElement(By.id("submitAccount")).click();


	}

}
