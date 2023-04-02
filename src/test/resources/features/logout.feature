@AZUL10-387
Feature: Logout functionality

  Background:
    Given user is on login page
    And user logs in as "hr"

  @AZUL10-391
  Scenario: Logout from profile menu
    When user clicks logout option from profile menu
    Then user lands on login page

  @AZUL10-392
  Scenario: Verify user can not go to homepage with previous button after logout
    When user clicks logout option from profile menu
    Then user lands on login page
    When user clicks previous button in browser
    Then user lands on login page

  @AZUL10-402
  Scenario: Verify logout after tab is closed
    When user closes all open tabs
    And user navigates to home page
    Then user lands on login page







