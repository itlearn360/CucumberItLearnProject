package stepdefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass {
	ChromeDriver driver;
	
	@Given("the user is on the home page {string}")
	public void the_user_is_on_the_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.id("loginlabel")).click();
	}

	@When("the user enter the valid username {string} and password {string}")
	public void the_user_enter_the_valid_username_and_password(String string, String string2) {
	   driver.findElement(By.id("user_login")).sendKeys(string);
	   driver.findElement(By.id("user_pass")).sendKeys(string2);
	}

	@When("click the login button")
	public void click_the_login_button() {
		
	   driver.findElement(By.name("wp-submit")).click();
	}



}
