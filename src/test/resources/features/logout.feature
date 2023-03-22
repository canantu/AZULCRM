Feature: Logout functionality

  Background:
    Given user is on login page
    When user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks log-in button

  Scenario: Logout from profile menu
    When user clicks username on profile menu
    And user clicks log-out option
    Then user lands on login page

  Scenario: Verify user can not go to homepage with previous button after logout
    When user clicks username on profile menu
    And user clicks log-out option
    And user clicks previous button
    Then user lands on login page

  Scenario: Verify logout after tab is closed
    When user closes tab
    And user opens a new tab and navigate to login page
    Then user lands on login page






