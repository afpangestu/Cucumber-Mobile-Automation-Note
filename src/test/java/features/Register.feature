@register
Feature: Register
  Scenario: User Success Register
    Given User is on the login page
    And User click don't have account? Register
    When User input valid data
    And User click register
    Then User is redirected to login