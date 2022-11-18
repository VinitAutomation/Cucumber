package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/java/Features/FetchTableData.feature", //the path of the feature files
			glue={"stepDefinition"},
			plugin = { "pretty", "html:target/cucumber/report.html" },
			tags = "@SmokeTest",	
			monochrome = true,
			dryRun = false //just to make sure if steps and step definition mapping is correct or not
				
			)
	 
	public class Test_Runner {
	 
	}
