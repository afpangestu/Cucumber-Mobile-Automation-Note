@login
Feature: Login
  Scenario: User Success Login
    Given User has an existing account
    When User enters username and password
    And User click login button
    Then User is redirected to home page