Feature: To check search functionality
  @NX
  Scenario: validate search functionality
    Given user is on home page
    And User click on "seach page"
    When user search"t shirt"
    Then user can see "t shirt"as result.