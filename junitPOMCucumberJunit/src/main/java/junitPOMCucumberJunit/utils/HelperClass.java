package junitPOMCucumberJunit.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	
	
	private static HelperClass helperClass;
    
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
       
     private HelperClass() {
      
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }      
               
    public static void openPage(String url) {
        driver.get(url);
    }
           
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static void setUpDriver() {
           
        if (helperClass==null) {
               
            helperClass = new HelperClass();
        }
    }
       
    public static void tearDown() {
            
        if(driver!=null) {
            driver.quit();
        }
            
       helperClass = null;
   } 

}
