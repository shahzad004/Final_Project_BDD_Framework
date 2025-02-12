Feature: Verfiy we are on Monday.com

  Scenario: Verify Website URL
    Given I am on Monday.com page
    When I click on resources button
    Then I will refresh the window
    Then I will get the window URL

