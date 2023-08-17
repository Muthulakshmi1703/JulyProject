Feature: Sample scenario for DataTable

  Scenario: Provide testdata with List
    Given Open browser
    And Launch facebook URL
    When User enters the username as List
      | Indhu |
      | Rinto |
    And User enters the password as List
      | indhu123 |
      | rinto123 |
    And Click the Login btn

  Scenario: Provide testdata with Lists
    Given Open browser
    And Launch facebook URL
    When User enters the username and password as Lists
      | Indhu | indhu123 |
      | Rinto | rinto123 |
      | Hema  | hema123  |
    And Click the Login btn

  Scenario: Provide testdata with Map
    Given Open browser
    And Launch facebook URL
    When User enters the username and password as Map
      | Username | Bhuvana    |
      | Password | bhuvana123 |
    And Click the Login btn

  Scenario: Provide testdata with Maps
    Given Open browser
    And Launch facebook URL
    When User enters the username password and mail as Maps
      | Username | Password   | Email                |
      | Pranith  | pranith123 | pranith123@gmail.com |
      | Ansar    | ansar123   | ansar123@gmail.com   |
      | Ayesha   | ayesha123  | ayesha123@gmail.com  |
    And Click the Login btn
