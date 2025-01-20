Feature: Register
  Scenario: Success Register
    Given Open the App
    And Click Don't have account? Register
    When Input valid data
    And Click register
    Then User successfully register