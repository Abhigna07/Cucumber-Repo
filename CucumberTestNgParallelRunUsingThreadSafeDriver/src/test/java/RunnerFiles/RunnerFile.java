package RunnerFiles;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "C:\\Users\\abhig\\OneDrive\\Desktop\\Cucumber Tutorials\\Cucumber Eclipse WS\\CucumberTestNgParallelRunUsingThreadSafeDriver\\src\\test\\resources\\featureFiles", glue = "StepDefinitions")


public class RunnerFile extends AbstractTestNGCucumberTests{
	
	@Override
	    @DataProvider(parallel = true)
         public Object[][] scenarios() {
		 return super.scenarios();
}
	   
}
