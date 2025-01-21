Feature: CRUD Note
  Scenario: Success Add Note
    Given User already logged in
    When User click floating action button add
    And User enters title and description
    And User click save button
    Then The note should be on the home page

  Scenario: Success Edit Note
    Given Notes are already on the homepage
    When User click edit button
    And User edit title and description
    And User click update button
    Then The note should be updated