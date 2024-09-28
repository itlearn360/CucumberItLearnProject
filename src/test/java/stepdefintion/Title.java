package stepdefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Title {
WebDriver driver;
String expectedtitle;
	@Given("I am on the home page of website {string}")
	public void i_am_on_the_home_page_of_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string); 
	}

	@When("I get the title of the page")
	public void i_get_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	     expectedtitle= "Online Training – Courses & Certification | ITLearn360";
	}

	@Then("the title should be {string}")
	public void the_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle);
	}
}
