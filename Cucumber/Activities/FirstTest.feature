@activity1
Feature: Activity to test the TS homepage

Scenario: TS homepage test
    Given user is on TS homepage
    When they click on About Us link
    Then they are redirected to the About page