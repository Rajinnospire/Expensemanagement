package testRunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"singlefile.feature"},
		
	      glue = {"StepDefinitionClass"},
		
		dryRun = false,
		
		plugin = {"pretty","html:target/Html-Report", "json:target/Json-Report/json-output.json"},
		
     monochrome= true, 
     
     strict = false
		
		)





public class SingleReceiptRunner extends AbstractTestNGCucumberTests {

}
