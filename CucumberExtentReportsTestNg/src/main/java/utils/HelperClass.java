package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	
	/*private static HelperClass helperClass;
    
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 30;
      
    private HelperClass() {
                   
             ChromeOptions options = new ChromeOptions();
             options.addArguments("--start-maximized");
             driver = new ChromeDriver(options);
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
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
     } */
    
    

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
