Feature: Login validations

Background: 
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
  
   @InvalidCredentials
   Scenario: Login with valid credentials
      
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login successfully and new page open
     
  
   
   
   @MissingUsername
   Scenario Outline: Login with blank username
       
    When User enters username as " " and password as "admin123"
    Then User should be able to see a message "Required" below Username
       
   @FaceBookLink @FailedTest
   Scenario: Verify FaceBook Icon on Login Page
      
    Then User should be able to see FaceBook Icon
     
   @LinkedInLink
   Scenario: Verify LinkedIn Icon on Login Page
      
    Then User should be able to see LinkedIn Icon  
     
   @ForgetPasswordLink
   Scenario: Verify ForgetPassword link on Login Page
      
    When User clicks on Forgot your Password Link
    Then User should navigate to a new page