Feature: Login Feature Scenario

  Background: 
    Given I have launched the application

  @regression
  Scenario: This scenario is to define the login happy path
    When I enter the correct username and passowrd
    And I click on the LOGIN Button
    Then I should land on the home page

  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect username and passowrd
    And I click on the LOGIN Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"
