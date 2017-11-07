package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	format = {"pretty", "html:target/Destination"},
		features = "Feature", glue={"testStepDef"}
		)

public class RunnerCucumberTest {

}
