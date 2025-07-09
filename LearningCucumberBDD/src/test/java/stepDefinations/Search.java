package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	public WebDriver driver;
	public String searchItems;

	@Given("Welcome page is displayed")
	public void welcome_page_is_displayed() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user eneter {string} in search text field")
	public void user_eneter_in_search_text_field(String searchItems) {
	   driver.findElement(By.id("small-searchterms")).sendKeys(searchItems);
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Search result must be displayed")
	public void search_result_must_be_displayed() {
		Assert.assertTrue(driver.findElement(By.name("Q")).getDomAttribute("value").contains(searchItems));
	  
	}
}
