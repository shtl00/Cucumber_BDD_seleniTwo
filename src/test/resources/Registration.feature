
Feature:Registration
  As an end user
  I want to register to the website
  So that i can login my account

  @SingleRegistration
  Scenario:Valid regestration without datatable
    Given I am on homepage
    When I click on "Registration"
    And I select "Female"
    And  I entre my first name "sheetal" and last name "parmar"
    And I entre my email "sheetalparmar@ymail.com" and password"abcd123"
    When I click on "Registration submitt" on registration page
    Then I should see "your registration completed" text on registration page
    And The url should contain with "/registrationresult"

  @RegistrationWithDataTable
  Scenario: :Valid registration using datatable
    Given I am on homepage
    When I click on "Registration"
    And I select "Female"
    And I entre following data for registration
      | firstname | lastname |emailId | password |   confirmpassword |
      | sheetal   | parmar   |sheetalparmar@ymail.com | abcd2008 | abcd2008 |
    When I click on "Registration submitt" on registration page
    Then I should see "your registration completed" text on registration page
    And The url should contain with "/registrationresult"



