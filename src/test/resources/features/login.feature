@smoke
Feature: Login Feature

  Scenario: Verify user login successfully

    Given user launches application
    When user enters username
    And user enters password
    And user clicks login button
    Then user should navigate to dashboard