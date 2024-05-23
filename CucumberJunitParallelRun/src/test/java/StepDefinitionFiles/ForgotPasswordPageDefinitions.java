package StepDefinitionFiles;

import org.junit.Assert;


import Utils.TestSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordPageDefinitions {
	
	TestSetUp setUp = new TestSetUp();
   
    public ForgotPasswordPageDefinitions() {
        
    }
 
    @When("User clicks on Forgot your password? link")
    public void forgotPasswordLink() {
 
    	setUp.pageObjectManager.getLoginPage().clickOnForgotPasswordLink();
 
    }
 
    @Then("User should be able to navigate to Reset Password page")
    public void verifyForgotPasswordPage() {
 
        Assert.assertEquals(setUp.pageObjectManager.getForgotPasswordPage().getForgotPageText(),"Reset Password");
 
    }
 
    @Then("User clicks on Cancel button to go back to Login Page")
    public void verifyCancelBtn() {
 
    	setUp.pageObjectManager.getForgotPasswordPage().clickOnCancelBtn();
        Assert.assertEquals(setUp.pageObjectManager.getLoginPage().getLoginPageTitle(),"Login");
 
    }
 
    @Then("User clicks on Reset Password button and provide username as {string}")
    public void verifyResetPasswordBtn(String username) {
 
    	setUp.pageObjectManager.getForgotPasswordPage().TypeOnUsernameTextBox(username);
    	setUp.pageObjectManager.getForgotPasswordPage().clickOnRestPasswordBtn();
 
    }
 
    @Then("Verify the message {string}")
    public void verifyMessage(String message) {
 
        //  ForgotPasswordPage forgotPasswordPage = setUp.pageObjectManager.getForgotPasswordPage();
        Assert.assertEquals(setUp.pageObjectManager.getForgotPasswordPage().getRestMessage(),message);
 
    }

}
