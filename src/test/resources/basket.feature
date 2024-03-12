@BF
Feature:
  As an end user
  i should be able search product and
  I should able to add product in basket


  Background:
    Given user on home page
    And user can search product
    When user "click on add " product
    Then user can see "product"in the basket


  Scenario:
      Given update "shoppingcart"
      And user select "Terms and conditions"
      When user click on "checkout"
      Then user can see"Welcome, Please Sign In!"text


  Scenario:
      Given User is on shopping cart page
      And I signin as "parmarsheetal@ymail.com"
      And I entre my password "abcd123"
      When I click on "Log In"button
      Then I can see"Shopping cart" text





