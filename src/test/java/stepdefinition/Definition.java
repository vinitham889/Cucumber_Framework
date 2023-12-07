package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	public WebDriver driver;
	//io.cucumber.junit.UndefinedStepException: The step 'Navigate to login page' and 4 other step(s) are undefined.
	//You can implement these steps using the snippet(s) below:

	@Given("Navigate to login page")
	public void navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
	}
	@When("Enter username")
	public void enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("userEmail")).sendKeys("vinitha.m@moolya.com");
	}
	@When("Enter password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		 driver.findElement(By.id("userPassword")).sendKeys("Rahul@123");
	}
	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}
	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}
	
	

	@When("Enter Invalidusername")
	public void enter_invalidusername() {
		driver.findElement(By.id("userEmail")).sendKeys("vinitha@moolya.com");
	}
	@When("Enter Invalidpassword")
	public void enter_invalidpassword() {
		driver.findElement(By.id("userPassword")).sendKeys("Rahul123");
	   
	}
	@When("click on loginBtn")
	public void click_on_login_btn() {
		driver.findElement(By.id("login")).click();
	}
	@Then("Error message should display")
	public void error_message_should_display() {
	    
	}












}
