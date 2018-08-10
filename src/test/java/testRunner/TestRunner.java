package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/JavaProject/com.test.cucumber/src/test/java/features/login.feature",
				glue = {"stepDefinitions"},
//				plugin = {"\"pretty\", \"html:target/cucumber-reports/cucumber-pretty\",\r\n" + 
//						"\"json:target/cucumber-reports/CucumberTestReport.json\", \"rerun:target/cucumber-reports/rerun.txt\""}
				plugin = {"pretty", "html:target/cucumber-html-report"},
                monochrome = true, //display the console output in a proper readable format
                strict = true, //it will check if any step is not defined in step definition file
                dryRun = false //to check the mapping is proper between feature file and step definition file
		
		)
public class TestRunner  {

	
}
