Feature: As a user, I should be able to upload files and pictures as messages

  Background:
    Given user logs in successfully
    And user clicks Messages menu
    And user clicks upload file link
  @wip
  Scenario: Verify user can upload multiple files at the same time
    When user uploads three files
    Then user sees three files attached

  Scenario Outline: Verify user can upload files in different formats
    When user uploads a "<file>"
    Then user sees the "<file>" attached
    Examples:
    |file|
    |picture    |
    |document    |
    |datafile    |


  Scenario Outline: Verify user can upload pictures
    When user uploads a "<picture>"
    Then user sees the file attached
    Examples:
      |picture|
      |png    |
      |jpeg    |

  Scenario: Verify user can display the uploaded picture itself in Activity Stream
    When user uploads a file
    And user clicks Send button
    Then user displays the picture on screen

  Scenario Outline: Verify user can insert the files and images into the text
    When user uploads a "<file>"
    And user clicks Insert in text button
    Then user sees png file on message area
    Examples:
    |file|
    |picture|
    |document|

  Scenario: Verify user can allow a recipient to edit documents
    When user uploads a file
    And user selects Allow a recipient to edit documents checkbox
    Then Allow to edit checkbox is selected

  Scenario: Verify user can remove files and images at any time before sending
    When user uploads a file
    And user clicks delete sign next to file
    Then file is removed from screen

  Scenario: Verify user can rename the file before sending it
    When user uploads a file
    And user hover over file name
    And user clicks pencil sign
    And user changes file name and clicks pencil sign
    Then file name is changed




