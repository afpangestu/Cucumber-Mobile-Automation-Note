@register
Feature: Register
  @positive
  @QaseSuite=Register
  @QaseFields={"description":"User_success_register","preconditions":"User_is_on_the_login_page","severity":"major","priority":"high"}
  Scenario: User Success Register
    Given User is on the login page
    And User click don't have account? Register
    When User input valid data
    And User click register
    Then User is redirected to login