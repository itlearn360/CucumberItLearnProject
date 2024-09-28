package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\truba\\eclipse-appium\\LoginProjectCucumber\\src\\test\\java\\featurePackage\\pageverification.feature",
    glue = "stepdefintion",
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
    tags = "@smoke"
)

public class TestRunner {

}
