
Feature: As a user, I should be able to create events by clicking on Event tab under Activity Stream

  Background:
    Given user logs in successfully
    And user clicks Event menu
  @wip
  Scenario: Verify that user can add Event date and time with the time zone
    When user enters event name "new event"
    And user selects event start date as "10/April/2023"
    And user selects event start time as "9:00:am"
    And user selects event end date as "12/April/2023"
    And user selects event end time as "9:00:pm"
    And user clicks Send button
    Then user sees created event "new event" item in Activity Stream

  Scenario: Verify All day checkbox
    When user selects All day checkbox
    Then user sees all day checkbox is selected
    Then user sees time select boxes disappear

  Scenario: Verify that user can specify time zone
    When user clicks specify time zone
    And use select a time zone for start time
    And user selects a different time zone for end time
    Then user sees different times zones are displayed for start and end date

  Scenario: Verify that time zone is displayed correctly in event page
    When user enters event name
    And user selects event start time "10:00:am"
    And user clicks Specify time zone link
    And use select a time zone for start time "Europe/London"
    And user clicks Send button
    Then user sees event start time "11:00:am" was displayed correctly in Activity Stream


  Scenario: Verify that user can not create event without event name
    When user clicks Send button
    Then user gets mandatory field error message

  Scenario: Verify that user can not select start date later than end date
    When user enters event name
    And user selects event start date as "tomorrow"
    And user selects event end data as "today"
    And user clicks Send button
    Then user gets invalid date error message

  Scenario: Verify that user can not select a start date before today
    When user enters event name
    And user selects event start date as "yesterday"
    And user clicks Send button
    Then user gets invalid date error message

  Scenario: Verify that user can not select a start time before the end time
    When user enters event name
    And user selects event start time as "8:30:pm"
    And user selects event end time as "8:30:am"
    And user clicks Send button
    Then user gets invalid time error message

  Scenario: Verify that today's date is shown as default for event start and end date
    Then user sees today's date is displayed as start date
    Then user sees today's date is displayed as end date

  Scenario Outline: Verify user can set reminder
    When user enters event name
    Then user sees set reminder checkbox is selected
    And user enters reminder time as "30"
    And user select "<time unit>"
    And user clicks Send button
    And user opens created event from Calender
    Then user sees selected "<reminder>" is displayed on screen
    Examples:
      | time unit | reminder |
      | minutes   | minutes  |
      | hours     | hours    |
      | days      | days     |

  Scenario: Verify event without reminder
    When user enters event name
    And user clicks set reminder checkbox
    Then user sees reminder checkbox is unselected
    And user clicks Send button
    And user opens created event from upcoming events side menu
    Then user sees no reminder is displayed on screen

  Scenario: Verify that user can not create event with negative reminder time
    When user enters event name
    Then user sees set reminder checkbox is selected
    And user enters reminder time as "-10"
    And user clicks Send button
    Then user gets invalid time message

  Scenario Outline: Verify that user can select the event location
    When user enters event name
    And user selects event "<location>"
    And user clicks Send button
    Then user sees created event item in Activity Stream
    Examples:
      | location             |
      | Central Meeting Room |
      | East Meeting Room    |
      | West Meeting Room    |

  Scenario Outline: Verify that user can not select an event location during the time range the location was occupied
    When user creates an event with "<first event start>" time, "<first event end>" time and "<location>"
    And user creates an event with "<second event start>" time, "<second event end>" time and "<location>"
    Then user gets location is occupied error message
    Examples:
      | first event start | first event end | location             | second event start | second event end |
      | 10:00:am          | 11:00:am        | Central Meeting Room | 10:00:am           | 10:30:am         |
      | 10:00:am          | 1:00:pm         | East Meeting Room    | 9:00:am            | 11:00:am         |
      | 9:00:am           | 5:00:pm         | West Meeting Room    | 4:00:pm            | 6:00:pm          |

  Scenario: Verify Cancel event button
    When user enters event name
    And user clicks Cancel button
    Then user sees no new event created

  Scenario Outline: Verify that user can add members by selecting individual contacts/groups/departments
    When user enters event name
    And user clicks Add employee link
    And user selects Employees and departments link
    And user selects a "<user/group/department>" and closes the menu
    And user clicks Send button
    Then user sees created event item in Activity Stream
    Examples:
      | user/group/department         |
      | helpdesk22@cybertekschool.com |
      | Corporate Christmas Party     |
      | QA Department                 |















