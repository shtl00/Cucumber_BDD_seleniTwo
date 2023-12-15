@BK
Feature:Login functionality
  As a end user
  I wan to login to website
  So that i can check my account

  Scenario Outline:Validate login page
    Given browser is open
    And user is on login page
    When user entre <username> and <password>
    And user click on next button
    Then user can see "logout"button

    Examples:
      | username                | password |
      | parmarsheetal@ymail.com | abcd123  |
      | sheetal@gmail.com       | abcd123  |

