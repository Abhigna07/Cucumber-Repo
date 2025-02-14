package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	 public final static int TIMEOUT = 30;
	
	 @Before
	    public static void setUp() {
	 
	       HelperClass.getDriverInstance();
	       HelperClass.getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	       HelperClass.getDriverInstance().manage().window().maximize();
	    }
	 
	    @After
	    public static void screenShot(Scenario scenario) {
	 
	    	
	        
	    	 if(scenario.isFailed()||String.valueOf(scenario.getStatus()).equalsIgnoreCase("failed")) {
	    		 
	    		 final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriverInstance()).getScreenshotAs(OutputType.BYTES);
	           
	            scenario.attach(screenshot, "image/png", scenario.getName()+"failed"); 
	        }   
	    	 
	    	 HelperClass.quit();
	         
	        
	    }
	    
	   
	    	
	    	
	    
	    
	    

}
