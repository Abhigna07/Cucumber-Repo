package Actions;

import org.openqa.selenium.support.PageFactory;

import Locators.ForgotPasswordLocators;
import utils.HelperClass;

public class ForgotPasswordActions {
	
	 ForgotPasswordLocators forgotPasswordLocators = null;
     
	    public ForgotPasswordActions() {
	         
	        this.forgotPasswordLocators = new ForgotPasswordLocators();
	 
	        PageFactory.initElements(HelperClass.getDriverInstance(),forgotPasswordLocators);
	    }
	  
	    // Get the Heading of Forgot Password page
	    public String getForgotPasswordPageText() {
	        return forgotPasswordLocators.ForgotPasswordHeading.getText();
	    }

}
