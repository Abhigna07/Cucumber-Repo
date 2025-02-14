package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node.Example;
import io.cucumber.plugin.event.Node.ScenarioOutline;
import utils.HelperClass;

public class Hooks {
	
    public final static int TIMEOUT = 10;
	
	 @Before
	    public static void setUp() {
	 
	       HelperClass.getDriverInstance();
	       HelperClass.getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	       HelperClass.getDriverInstance().manage().window().maximize();
	    }
	 
	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed() ) {
	            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriverInstance()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	        HelperClass.quit();
	    }

}
