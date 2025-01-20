@register
Feature: Register
  Scenario: User Success Register
    Given the user is on the login page
    And the user click don't have account? Register
    When the user input valid data
    And the user click register
    Then the user is redirected to login