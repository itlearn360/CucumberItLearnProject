Feature: Login Functionality

  Background:
    Given the user is on the home login page "https://demo.itlearn360.com/"

  @LoginTest
  Scenario Outline: Test login with multiple sets of credentials
  	When perform click on login button
    When the user enters "<username>" and "<password>"
    And the click the login button
    Then the check the text ass "<text>"

    Examples:
      | username        | password   | text          |
      | demo12          |Test123456$ | Dashboard     |
      | demo1234       |Test1234    | DashBoard.     |