@scrollfeature
Feature: Explore Website Scroll feature

  Scenario: Scroll the Page up and down
    Given landingPage
    When I scroll down
    When I scroll up
    Then I should see the top content
