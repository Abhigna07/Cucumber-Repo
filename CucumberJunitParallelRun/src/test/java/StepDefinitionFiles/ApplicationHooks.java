package StepDefinitionFiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	public TestSetUp setUp = new TestSetUp();
	 
    public ApplicationHooks() {
      
    }
 
    @After
    public void tearDown( )  {
        setUp.baseTest.WebDriverManager().quit();
    }
 
    @AfterStep
    public void addScreenshot(Scenario scenario) {
 
        WebDriver driver =  setUp.baseTest.WebDriverManager();
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
 
    }	

}
