package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/fwzna/eclipse-workspace/Truist/src/main/java/Features/Signed.feature"},  //src/main/java/Features
		glue= {"Stepdefinitions"},
		monochrome = true,
		tags="@Adhoc"
		)
public class Run {
	
}
