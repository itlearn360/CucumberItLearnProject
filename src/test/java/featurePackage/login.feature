Feature: Login functionality
Scenario: Successful login with valid credentials
    Given the user is on the home page "https://demo.itlearn360.com/"
    Then click on login button 
    When the user enter the valid username "Demo12" and password "Test123456$"
    And click the login button