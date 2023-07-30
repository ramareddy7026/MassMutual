package TestRunnerrr;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\bheem\\eclipse-workspace\\Ram1Cucumber\\src\\main\\java\\feature\\login.feature", //the path of the feature files
		glue={"StepDefinitions"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		monochrome = true, 
		strict = true, 
		dryRun = true
		
)

public class TestRunner {

}
