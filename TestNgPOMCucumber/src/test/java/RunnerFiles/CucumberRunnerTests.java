package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"C:\\Users\\abhig\\OneDrive\\Desktop\\Cucumber Tutorials\\Cucumber Eclipse WS\\TestNgPOMCucumber\\src\\test\\resources\\featureFiles\\LoginPage.feature"}, glue = {"definitionFiles"},
plugin = {"rerun:target/failedrerun.txt"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests{

}
