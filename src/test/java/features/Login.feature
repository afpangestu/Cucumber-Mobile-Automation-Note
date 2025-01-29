@login
Feature: Login
  @positive
  @QaseSuite=Login
  @QaseFields={"description":"User_success_login","preconditions":"User_has_an_existing_account","severity":"major","priority":"high"}
  Scenario Outline: User Success Login
    Given User has an existing account
    When User enters valid <username> and <password>
    And User click login button
    Then User is redirected to home page
    Examples:
      | username | password |
      | ajifauzi | ajifauzi123 |

  @negative
  @QaseSuite=Login
  @QaseFields={"description":"User_failed_login","preconditions":"User_has_an_existing_account","severity":"major","priority":"high"}
  Scenario Outline: User Failed Login Using Empty
    Given User has an existing account
    When User enters invalid <username> and <password>
    And User click login button
    Then User failed login and show message error <scenario>
    Examples:
      | username | password | scenario |
      |          |          | blank    |
      | ajifauzi |          | blank_pass |
      | ajifauzi | ajifauzi1321 | wrong_user_pass |