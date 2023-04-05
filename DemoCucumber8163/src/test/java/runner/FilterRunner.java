package runner;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//Feature//SelectProduct.feature",".//Feature//Filter.feature"},

		glue= {"aero"},
		dryRun = false ,
		monochrome = true ,
		tags="@functional,@smoke"  ,
		
		plugin = {"pretty","html:target/test-output","json:abc/cucumber.json","junit:cucumber-report/cucumber.xml"}
		
				
		
		
		
		)



public class FilterRunner {
	

}
