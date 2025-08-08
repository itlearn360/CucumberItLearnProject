 Feature: Compare Title and login to page
@smoke
  Scenario: Verify the homepage title
    Given Open the webpage ITLearn360 homepage "https://demo.itlearn360.com/"
    Then the title of the page  "Online Training – Courses & Certification | ITLearn360"

  @regression
  Scenario: Verify the text in next page
    Given the user is on  ITLearn360 homepage "https://demo.itlearn360.com/"
    Then click  login button
    When the user enter the  username "Demo12" and password "Test123456$"
    And click submit button
    Then compare text "Dashboard"



