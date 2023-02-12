package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo14082022.feature",
glue= {"StepsDefinitions"},
monochrome = true,
//plugin = {"pretty","html:targey/htmlReports"})
plugin = {"json:target/cucumber.json"})

public class TestRunner {
	
	

}
