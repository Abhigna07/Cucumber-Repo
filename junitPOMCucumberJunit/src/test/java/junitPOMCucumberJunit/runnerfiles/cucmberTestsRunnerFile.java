package junitPOMCucumberJunit.runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "C:\\Users\\abhig\\OneDrive\\Desktop\\Cucumber Tutorials\\Cucumber Eclipse WS\\junitPOMCucumberJunit\\src\\test\\resources\\features\\loginPage.feature", glue = "junitPOMCucumberJunit.stepDefinitaions",
                 plugin = {})

public class cucmberTestsRunnerFile {
	

}
