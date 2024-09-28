Feature: Google Search
Scenario: Search for a text on Google website 
    Given the user is on the Google homepage "https://www.google.com/"
    When the user enters "Cucumber tutorial" into the search box
    And the user clicks the search button