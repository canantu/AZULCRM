@AZUL10-386
Feature: Login functionality

  Background:
    Given user is on login page

  @AZUL10-375 @smoke
  Scenario Outline: Login with valid credentials
    When user logs in as "<user>"
    Then user lands on homepage
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @AZUL10-378
  Scenario Template: Login with invalid credentials
    When user logs in with "<username>" and "<password>"
    Then user lands on login page
    Then user gets error message
    |Incorrect login or password|
    Examples:
      | username                       | password  |
      | hr90@cybertekschool.com        | useruser  |
      | marketing90@cybertekschool.com | UserUserr |
      | helpdesk90@cybertekschool.com  | Useruser  |
      | hrmanager@cybertekschool.com   | UserUser  |
      | .++!$%&/                       | .++!$%&/  |
      | helpdesk90@cybertekschool.com  | .++!$%&/  |

  @AZUL10-379
  Scenario Template: Login without credentials
    When user logs in with "<username>" and "<password>"
    Then user gets error message
    |Please fill out this field|
    Examples:
      | username                       | password |
      |                                | UserUser |
      | marketing90@cybertekschool.com |          |
      |                                |          |

  @AZUL10-380
  Scenario: Verify "forgot your password" link
    Then user sees forgot your password link is displayed
    When user click forgot your password link
    Then user lands on get password page

  @AZUL10-381
  Scenario: Verify "remember me" text
    Then user is able to see remember me text

  @AZUL10-382
  Scenario: Verify "remember me" checkbox
    When user clicks remember me checkbox
    Then user sees checkbox is selected
    When user clicks remember me checkbox
    Then user sees checkbox is unselected

  @AZUL10-383
  Scenario: Verify password appears in bullet signs
    When user enters "UserUser" to password field
    Then user sees password is displayed in bullet signs

  @AZUL10-384
  Scenario: Verify enter key for submitting login page
    When user enters "hr12@cybertekschool.com" to username field
    And user enters "UserUser" to password field
    And user presses enter key from keyboard
    Then user lands on homepage

  @AZUL10-385
  Scenario Outline: Verify username appears on homepage after login
    When user logs in as "<user>"
    Then user sees username is displayed on homepage
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |




