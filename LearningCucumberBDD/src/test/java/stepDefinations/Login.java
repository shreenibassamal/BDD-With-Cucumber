package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	   driver.findElement(By.partialLinkText("Log in")).click();
	}

	@When("user enters valid useranme and valid password")
	public void user_enters_valid_useranme_and_valid_password() {
	 driver.findElement(By.id("Email")).sendKeys("shreenibas@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("Shree@751");
	}
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("User should be successfully logedin")
	public void user_should_be_successfully_logedin() {
	    Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	}

	@Then("Browser should be close")
	public void browser_should_be_close() {
	  driver.quit();

}
}
