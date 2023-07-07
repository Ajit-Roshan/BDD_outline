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
		plugin = {"pretty" , "html:target/Report" , "junit:target/junitReport.xml"  },
		monochrome = false ,
		dryRun = false
		)

public class ExecutorTest {

}
