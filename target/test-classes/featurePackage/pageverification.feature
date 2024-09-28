@homepage
Feature: ITLearn360 Demo Page Verification

  @smoke
  Scenario: Verify the homepage title
    Given the user is on  ITLearn360 homepage "https://demo.itlearn360.com/"
    Then the title of the page  "Online Training – Courses & Certification | ITLearn360"

  @regression
  Scenario: Verify the text in next page
    Given the user is on  ITLearn360 homepage "https://demo.itlearn360.com/"
    Then verify text "Dashboard"