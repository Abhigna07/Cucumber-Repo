package Stepdefintion;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;

public class stepdefinitions implements En{
	
	public stepdefinitions()
	
	{
		
		
		When("I Repeat Steps {string} for {int} times", (String stepText,Integer int1) -> {
			
		
			for (int i = 0; i < int1; i++) {
              
            }
			   
		});

		
	}
	
	 private void executeStep(String stepText) {
	        switch (stepText) {
	            case "performAction":
	                performAction();
	                break;
	            // Add more cases for other steps if needed
	            default:
	                throw new PendingException("Step not implemented: " + stepText);
	        }
	    }

	    // Method to perform the action you want to repeat
	    private void performAction() {
	        // Implement logic to perform the action
	    }
	

	@Given("I login to Hrm App")
	public void i_login_to_hrm_app() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	

	@Then("Test is succeeded")
	public void test_is_succeeded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	

}
