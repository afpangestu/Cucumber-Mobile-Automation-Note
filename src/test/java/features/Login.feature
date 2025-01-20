@login
Feature: Login
  Scenario: User Success Login
    Given the user has an existing account
    When the user enters username and password
    And the user click login button
    Then the user is redirected to home page