package Actions;

import org.openqa.selenium.support.PageFactory;

import Locators.HomePageLocators;
import Utils.HelperClass;

public class HomePageActions {
	
HomePageLocators homePageLocators = null;
    
    public HomePageActions() {
           
    	homePageLocators=   PageFactory.initElements(HelperClass.getDriverInstance(),HomePageLocators.class);
    }
   
    
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.getHomePageUserName().getText();
    }


}
