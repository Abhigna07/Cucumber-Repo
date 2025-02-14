package StepDefinitionFiles;

import org.junit.Assert;


import Utils.TestSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
	TestSetUp setUp = new TestSetUp();

 
 
    public LoginPageDefinitions()  {
       
    }
 
    @Given("User is on Home page")
    public void loginTest()  {
        setUp.baseTest.WebDriverManager().get("https://opensource-demo.orangehrmlive.com/");
 
    }
 
    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
 
        // login to application
    	setUp.pageObjectManager.getLoginPage().login(userName, passWord);
 
        // go the next page
 
    }
 
    @Then("User should be able to login successfully")
    public void verifyLogin() {
 
        // Verify home page
        Assert.assertTrue(setUp.pageObjectManager.getHomePage().getHomePageText().contains("Dashboard"));
 
    }
 
    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
 
        // Verify home page
        Assert.assertEquals(setUp.pageObjectManager.getLoginPage().getErrorMessage(),expectedErrorMessage);
 
    }
 

}
