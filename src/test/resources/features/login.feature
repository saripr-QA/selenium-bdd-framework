@login
Feature: Login Functionality

  @smoke @regression
  Scenario Outline: Verify login functionality

    Given user launches browser
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then user should see "<expectedResult>"

    Examples:
      | username | password | expectedResult                     |
      | admin1   | admin123 | Invalid credentials                |
      | admin    | admin123 | Dashboard displayed                |
