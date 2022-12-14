Feature: Login Functionality

  @wip
  Scenario Outline: User should be able to login with valid credentials
    When The user click on Get Started button
    And  The user enters valid "<username>" and "<password>"
    Then The user should be on the main page

    Examples:
      | username            | password   |
      | ayse10121984@gmail.com | 123456 |
