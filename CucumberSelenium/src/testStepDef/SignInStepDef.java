package testStepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Init;

public class SignInStepDef extends Init {

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/Users/amitshekhar/Documents/Tanya/setups/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");

		driver.manage().window().maximize();

	}

	@When("^User Navigate to SignIn Page$")
	public void user_Navigate_to_SignIn_Page() throws Throwable {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("User is on Sign In page");
	}

	@When("^User enters \"([^\"]*)\" and clicks on CreateAnAccount$")
	public void user_enters_and_clicks_on(String EmailAddress) throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys(EmailAddress);
		driver.findElement(By.id("SubmitCreate")).click();

	}

	@Then("^User is displayed with Register page$")
	public void user_is_displayed_with_Register_page() throws Throwable {
		driver.findElement(By.id("customer_firstname")).isDisplayed();

		System.out.println("User email id registration successful");
		System.out.println("User is on Create Account page");
	}

}
