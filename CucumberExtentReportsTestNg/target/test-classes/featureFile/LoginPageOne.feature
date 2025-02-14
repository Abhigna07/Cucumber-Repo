Feature: InValid Login validations

Background: 
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
    
   @InvalidCredentials
   Scenario Outline: Login with invalid credentials
      
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"
     
 Examples:
   | username   | password  | errorMessage                      |
   | Admin      | admin12$$ | Invalid credentials               |
   | admin$$    | admin123  | credentials               |
   | abc123     | xyz$$     | credentials               |