Feature: Compare Page Title 
 Scenario: Verify the title of the home page
    Given I am on the home page of website "https://demo.itlearn360.com/"
    When I get the title of the page
    Then the title should be "Online Training – Courses & Certification | ITLearn360"