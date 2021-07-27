package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue="stepDefinition",
		monochrome = true,
		plugin={"json:reports/ajio.json","pretty"}
		
		
		)
public class TestRunner {

}
