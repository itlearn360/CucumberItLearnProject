package stepdefintion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLogin {
	WebDriver driver;
	@Given("the user is on the home login page {string}")
	public void the_user_is_on_the_home_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("perform click on login button")
	public void perform_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginlabel")).click();
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user_login")).sendKeys(string);
		   driver.findElement(By.id("user_pass")).sendKeys(string2);
	}

	@When("the click the login button")
	public void the_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("wp-submit")).click();
	}

	@Then("the check the text ass {string}")
	public void the_check_the_text_ass(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String expectedText= "Dashboard";
	   WebElement actualText= driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
	   Assert.assertEquals(actualText.getText(), expectedText);
	}



}
