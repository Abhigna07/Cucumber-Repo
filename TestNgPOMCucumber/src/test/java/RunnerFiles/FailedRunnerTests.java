package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"@target/failedrerun.txt"}, glue = {"definitionFiles"},
plugin = {})
public class FailedRunnerTests extends AbstractTestNGCucumberTests{

}
