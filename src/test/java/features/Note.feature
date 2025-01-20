Feature: CRUD Note
  Scenario: Success Add Note
    Given User already logged in
    When User click floating action button add
    And User enters title and description
    And User click save button
    Then the note should be on the home page