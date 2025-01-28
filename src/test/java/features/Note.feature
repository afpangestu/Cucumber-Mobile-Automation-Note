@note
Feature: CRUD Note
  @QaseSuite=Note
  @QaseFields={"description":"User_success_add_note","preconditions":"User_is_on_the_login_page","severity":"major","priority":"high"}
  Scenario: Success Add Note
    Given User already logged in
    When User click floating action button add
    And User enters title and description
    And User click save button
    Then The note should be on the home page

  @QaseSuite=Note
  @QaseFields={"description":"User_success_edit_note","preconditions":"Notes_are_already_on_the_home_page","severity":"major","priority":"high"}
  Scenario: Success Edit Note
    Given Notes are already on the homepage
    When User click edit button
    And User edit title and description
    And User click update button
    Then The note should be updated

  @QaseSuite=Note
  @QaseFields={"description":"User_success_delete_note","preconditions":"Notes_are_already_on_the_home_page","severity":"major","priority":"high"}
  Scenario: Success Delete Note
    Given Notes are already on the homepage
    When User click delete button
    And Show the dialog confirmation
    And User click delete
    Then The note should be deleted