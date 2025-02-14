package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.HelperClass;

public class Hook {
	
	 public final static int TIMEOUT = 30;
	
	@Before
    public static void setUp() {
     //  HelperClass.setUpDriver();
		 HelperClass.getDriverInstance();
	       HelperClass.getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	       HelperClass.getDriverInstance().manage().window().maximize();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        //validate if scenario has failed
       // if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriverInstance()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
            HelperClass.quit();
       // }   
     
       
    }
    

    
    

}
