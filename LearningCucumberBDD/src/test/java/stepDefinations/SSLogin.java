package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin {
	WebDriver driver;
	@Given("Browser is open and URL navigated")
	public void browser_is_open_and_url_navigated() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/");
	   
	}

	@Given("Login page shoiuld be displayed")
	public void login_page_shoiuld_be_displayed() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {
	   driver.findElement(By.id("Email")).sendKeys(userName);
	   driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("Shopper should be successfully logged in")
	public void shopper_should_be_successfully_logged_in() {
		Assert.assertTrue( driver.findElement(By.xpath("//h3[contains(text(),'Hello')] ")).isDisplayed());
	}

	@Then("Merchant should be successfully logged in")
	public void merchant_should_be_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should be successfully logged in")
	public void admin_should_be_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("shooper login is displayed")
	public void shooper_login_is_displayed() {
	   Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Shopper')]")).isDisplayed());
	}

	@Given("Merchant login is displayed")
	public void merchant_login_is_displayed() {
	   System.out.println("merchant not logged in");
	}

	@Given("Admin login is displayed")
	public void admin_login_is_displayed() {
		System.out.println("Admin not logged in");
	}
	
	@Then("Browser Must be close")
	public void Browser_Must_be_close() {
	   driver.quit();
	}
}
