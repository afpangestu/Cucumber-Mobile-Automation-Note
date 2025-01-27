@login
Feature: Login
  @positive
  @QaseSuite=Login
  @QaseFields={"description":"User_success_login","preconditions":"User_has_an_existing_account","severity":"major","priority":"high"}
  Scenario: User Success Login
    Given User has an existing account
    When User enters username and password
    And User click login button
    Then User is redirected to home page