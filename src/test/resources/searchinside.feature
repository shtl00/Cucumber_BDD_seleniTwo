@Bk
  Feature:
    As end user i can write in search field
  Scenario:Validate search functionality
    Given user is on home page
    And user "write" in input field
    When user click on search button
    Then user can see search "product list"


