package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/java/Features/FetchTableData.feature", //the path of the feature files
			glue={"stepDefinition"},
			plugin = { "pretty", "html:target/cucumber/report.html" },
			monochrome = true,
			dryRun = false //just to make sure if steps and step definition mapping is correct or not
			
			
			
			//the path of the step definition files
			//plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			//monochrome = true, //display the console output in a proper readable format
			//strict = true, //it will check if any step is not defined in step definition file
			//dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class Test_Runner {
	 
	}
