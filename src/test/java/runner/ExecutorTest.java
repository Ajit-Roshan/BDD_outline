// we must include test in the runner file to successfully
// pickedUP by the maven during the execution of (maven test) 


package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"stepDefinations"},
		tags = "@orange_hrm or @demo_login",
		plugin = {"pretty" , "html:target/Report"},
		monochrome = false
		)

public class ExecutorTest {

}
