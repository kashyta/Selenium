package automationTestNg;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class LaunchApplication {

	protected static WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "/Users/amitshekhar/Documents/Tanya/setups/chromedriver");
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com");

		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).isDisplayed();
		System.out.println("Application launched Successfully");

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
		// driver.quit();
	}

}
