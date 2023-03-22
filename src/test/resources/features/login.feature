Feature: Login functionality

  Background:
    Given user is on login page
@wip
  Scenario Template: Login with valid credentials
    When user enters "<username>" and "<password>"
    And user clicks log-in button
    Then user lands on homepage
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | marketing90@cybertekschool.com | UserUser |
      | helpdesk90@cybertekschool.com  | UserUser |

  Scenario Template: Login with invalid credentials
    When user enters "<username>" and "<password>"
    And user clicks log-in button
    Then user lands on login page
    Then user gets incorrect login message
    Examples:
      | username                       | password  |
      | hr90@cybertekschool.com        | useruser  |
      | marketing90@cybertekschool.com | UserUser1 |
      | helpdesk90@cybertekschool.com  | Useruser  |
      | hrmanager@cybertekschool.com   | UserUser  |
      | .+#+!$%&/                      | .+#+!$%&/ |
      | helpdesk90@cybertekschool.com  | .+#+!$%&/ |

  Scenario Template: Login without credentials
    When user enters "<username>" and "<password>"
    And user clicks log-in button
    Then user gets please fill out message
    Examples:
      | username                       | password |
      |                                | UserUser |
      | marketing90@cybertekschool.com |          |
      |                                |          |

  Scenario: Verify "forgot your password" link
    Then forgot your password link is clickable
    When user click forgot your password link
    Then user lands on get password page

  Scenario: Verify "remember me" text
    Then remember me text is displayed

  Scenario: Verify "remember me" checkbox
    When user clicks remember me checkbox
    Then checkbox is selected
    When user clicks remember me checkbox
    Then checkbox is unselected

  Scenario: Verify password appears in bullet signs
    When user enters "hr1@cybertekschool.com" and "UserUser"
    Then password is displayed in bullet signs

  Scenario: Verify enter key for submitting login page
    When user enters "hr1@cybertekschool.com" and "UserUser"
    And user presses enter key from keyboard
    Then user lands on homepage

  Scenario: Verify username appears on homepage after login
    When user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks log-in button
    Then username is displayed on homepage




