Feature: Home Page Scenario

  Background: 
    Given I have launched the application
    When I enter the correct username and passowrd
    And I click on the LOGIN Button
    Then I should land on the home page
  
  @sanity
  Scenario Outline: 
    When I click on ADD TO CART on a product  "<Product>"
    Then basket value shhould be 1

    Examples: 
      | Product             |
      | Sauce Labs Backpack |
