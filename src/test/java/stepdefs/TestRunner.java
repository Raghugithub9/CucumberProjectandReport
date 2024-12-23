package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features="src/test/java/features",
		glue="stepdefs",
		//tags= {"@Sanity or @Regression "}//or condition
		//tags= {"@Sanity and @Regression "}//and condition	
		//tags= {"@Calculator "} //Feature level
		//tags= {"@Login and not @WIP "}//not condition
		tags= {"@Login"}//not condition
		)


public class TestRunner {

}
