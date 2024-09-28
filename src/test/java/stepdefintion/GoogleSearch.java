package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleSearch {
	ChromeDriver driver;
	@Given("the user is on the Google homepage {string}")
	public void the_user_is_on_the_google_homepage(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string);
	}

	@When("the user enters {string} into the search box")
	public void the_user_enters_into_the_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
	}

	@When("the user clicks the search button")
	public void the_user_clicks_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnK")).submit();
	}
}
