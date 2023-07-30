package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepdefinations {
	WebDriver driver;
	
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com/index.html"); 
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("naveenk");
		 driver.findElement(By.name("password")).sendKeys("test@123");   
	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
		WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	}

	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("tom");
		 driver.findElement(By.name("password")).sendKeys("test@123"); 
	}

	@Then("^User should see an error message$")
	public void user_should_see_an_error_message() throws Throwable {
	  driver.getTitle(); 
	}

	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO", title);
	}

	@When("^User adds items to the shopping cart$")
	public void user_adds_items_to_the_shopping_cart() throws Throwable {
	   
	}

	@Then("^Items should be displayed in the cart$")
	public void items_should_be_displayed_in_the_cart() throws Throwable {  
	}

	@Given("^User has added items to the shopping cart$")
	public void user_has_added_items_to_the_shopping_cart() throws Throwable {   
	}
	@When("^User checks the total cost$")
	public void user_checks_the_total_cost() throws Throwable {   
	}

	@Then("^Total cost should be calculated correctly$")
	public void total_cost_should_be_calculated_correctly() throws Throwable {    
	}

}
