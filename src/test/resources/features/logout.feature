@AZUL10-387
Feature: Logout functionality

  @AZUL10-391
  Scenario: Logout from profile menu
    Given user is on login page
    And user logs in as "hr"
    When user clicks logout option from profile menu
    Then user lands on login page

  @AZUL10-402
  Scenario: Verify logout after tab is closed
    When user navigates to "home" page
    Then user lands on login page

  @AZUL10-392
  Scenario: Verify user can not go to homepage with previous button after logout
    Given user is on login page
    And user logs in as "hr"
    When user clicks logout option from profile menu
    Then user lands on login page
    When user clicks previous button in browser
    Then user lands on login page








