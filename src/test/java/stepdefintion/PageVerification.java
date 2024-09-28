package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PageVerification {
	WebDriver driver = HooKsBeforeAfter.getDriver();
	@Given("the user is on  ITLearn360 homepage {string}")
	public void the_user_is_on_it_learn360_homepage(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get(string);
	}

	@Then("the title of the page  {string}")
	public void the_title_of_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  String actualtitle=driver.getTitle();
		  Assert.assertEquals(actualtitle, string);
	}

	@Then("verify text {string}")
	public void verify_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		   WebElement actualText= driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
		   Assert.assertEquals(actualText.getText(), string);
	}
}
