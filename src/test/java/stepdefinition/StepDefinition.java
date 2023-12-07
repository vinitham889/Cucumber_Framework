package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public WebDriver driver;

	@Given("Open the browser and go to the login page of rahulsheety")
	public void open_the_browser_and_go_to_the_login_page_of_rahulsheety() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
	    
	}
	@When("Enter the valid name {string}")
	public void enter_the_valid_name(String string) {
		
		driver.findElement(By.id("userEmail")).sendKeys(string);
	    
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String string) {
		
		driver.findElement(By.id("userPassword")).sendKeys(string);
	    
	}
	@When("Click on loginBtn")
	public void click_on_login_btn() {
		driver.findElement(By.id("login")).click();
	    
	}
	@Then("I should see the username as")
	public void i_should_see_the_username_as() {
		//Home page should be displayed
	}
	

	@When("Enter invalid name {string}")
	public void enter_invalid_name(String string) {
		driver.findElement(By.id("userEmail")).sendKeys(string);
	}
	@When("Enter invalid password {string}")
	public void enter_invalid_password(String string) {
		driver.findElement(By.id("userPassword")).sendKeys(string);
	}
	@Then("I should see {string}")
	public void i_should_see(String string) {
	    
	}






}
