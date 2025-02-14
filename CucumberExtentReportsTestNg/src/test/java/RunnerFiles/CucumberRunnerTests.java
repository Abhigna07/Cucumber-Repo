package RunnerFiles;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@InvalidCredentials", features = "C:\\Users\\abhig\\OneDrive\\Desktop\\Cucumber Tutorials\\Cucumber Eclipse WS\\CucumberExtentReportsTestNg\\src\\test\\resources\\featureFile", glue = "StepDefinitions",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = true)
     public Object[][] scenarios() {
	 return super.scenarios();

}

}

