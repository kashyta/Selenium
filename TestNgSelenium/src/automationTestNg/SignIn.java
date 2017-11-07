package automationTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.junit.Assert;

public class SignIn extends LaunchApplication {
	@Test
	public void Registration() {

		System.out.println("driver = " + driver);

		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("test12345@seleniumautomation.com");
		String create_email = driver.findElement(By.id("email_create")).getAttribute("value");
		System.out.println(" Email used at the time of Sign In " + create_email);
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("customer_firstname")).isDisplayed();
		System.out.println("User is on Sign In page");

		// #Fill Registration Form

		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Abc");
		driver.findElement(By.id("customer_lastname")).sendKeys("XyZ");
		// Verify same email is prompted

		String email = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(" Email used at the time of Registration " + email);
		Assert.assertEquals(create_email, email);

		driver.findElement(By.id("passwd")).sendKeys("test@1276554Ws");
		Select days = new Select(driver.findElement(By.name("days")));
		days.selectByValue("8");
		Select months = new Select(driver.findElement(By.name("months")));
		months.selectByValue("4");
		Select years = new Select(driver.findElement(By.name("years")));
		years.selectByValue("1988");

		driver.findElement(By.id("optin")).click();

		// Address

		driver.findElement(By.id("firstname")).sendKeys("Abc");
		driver.findElement(By.id("lastname")).sendKeys("Awd");
		driver.findElement(By.id("company")).sendKeys("Scde");
		driver.findElement(By.id("address1")).sendKeys("2345");
		driver.findElement(By.id("address2")).sendKeys("Qwert Street");
		driver.findElement(By.id("city")).sendKeys("Santa Kilo");
		Select state = new Select(driver.findElement(By.name("id_state")));
		state.selectByVisibleText("California");
		driver.findElement(By.id("postcode")).sendKeys("89763");
		Select country = new Select(driver.findElement(By.name("id_country")));
		country.selectByVisibleText("United States");

		// Additional Information

		driver.findElement(By.id("other")).sendKeys("xedcvfr yhnnmj tyhgfcvb wsddh");
		driver.findElement(By.id("phone")).sendKeys("98723456789");
		driver.findElement(By.id("phone_mobile")).sendKeys("9876543890");
		driver.findElement(By.id("alias")).sendKeys("Home");

		driver.findElement(By.id("submitAccount")).click();

	}
}
