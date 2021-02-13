package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//src/test/resources/features/login.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome= true,
		plugin={"pretty","summary","html:target/cucumber.html"}
		)
public class TestRun {

	
	
	
	
}
