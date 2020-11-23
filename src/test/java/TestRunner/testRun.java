package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
			(features = "src/test/resources/Feature/LoginFeaure.feature",
			glue = {"loginpageStepdefination"},
			dryRun = true,
			monochrome = true,
			plugin = {"pretty", "html:target/Cucumber"}
			 )

public class testRun {

}