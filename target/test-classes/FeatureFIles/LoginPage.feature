Feature: Adactin LoginPage testcases

  Scenario: Login with Valid Credentials
    Given Open the Browser
    And Launch the Adactin URL
    When Enter username as "Muthulakshmi07"
    And Enter password as "Test@123"
    And Click on Login button
    Then Validate User logged in or not

  Scenario Outline: Login with different datads
    Given Open the Browser
    And Launch the Adactin URL
    When Enter username as "<username>"
    And Enter password as "<password>"
    And Click on Login button
    Then Validate User logged in or not

    Examples: 
      | username | password |
      | Ansar    | ansar123 |
      | Rinto    | rinto123 |
      | Indhu    | indhu123 |

  Scenario: validate adactin url
    Given Open the Browser
    And Launch the Adactin URL
    Then Validate Adactin URL launched successfully
