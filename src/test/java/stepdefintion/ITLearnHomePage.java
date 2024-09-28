package stepdefintion;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ITLearnHomePage {

	WebDriver driver = HooKsBeforeAfter.getDriver();

	@Given("the user is on the ITLearn360 demo homepage {string}")
	public void the_user_is_on_the_it_learn360_demo_homepage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}


    @Then("the title of the page should be {string}")
    public void the_title_of_the_page_should_be(String expectedTitle) {
   
    String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedTitle);
    }
}
