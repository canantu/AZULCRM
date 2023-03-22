Feature: Logout functionality

  Background:
    Given user is on login page
    And user logs in as "hr"
@wip
  Scenario: Logout from profile menu
    When user clicks logout option from profile menu
    Then user lands on login page

  Scenario: Verify user can not go to homepage with previous button after logout
    When user clicks username on profile menu
    And user clicks log-out option
    When user clicks previous button
    Then user lands on login page

  Scenario: Verify logout after tab is closed
    When user closes tab
    And user opens a new tab and navigate to login page
    Then user lands on login page






