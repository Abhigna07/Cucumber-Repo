package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	
	 // ThreadLocal used to manage the driver
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
    // Private constructor to prevent the creation of new instances of Driver
    private HelperClass(){}
    
    public static WebDriver getDriverInstance() {
        if (driver.get() == null) {
           driver.set(new ChromeDriver());
          
        }

        return driver.get();
    }
    
    
    public static void openPage(String url) {
        driver.get().get(url);
    }
        
    
    public static void quit() {
        driver.get().quit();
        driver.remove();
    }


}
