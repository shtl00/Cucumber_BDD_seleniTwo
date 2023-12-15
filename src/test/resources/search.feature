Feature: To test google search functionality
  Scenario: Validate google search is working
    Given browser is open
    And user is on googlesearch page
    When user enter a text in search box
    And hits entre user nevigate search result
