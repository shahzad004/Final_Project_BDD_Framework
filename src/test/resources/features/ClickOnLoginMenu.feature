@SMOKE
Feature: Login Into Monday.com
  Scenario: perform login task
    Given I am at main page
    When I will click on loginMenu
    When I will be in loginpage
    Then I will enter my email "shahzadkhan07874@gmail.com"
    Then I will click on continou
    Then I will enter my password "Monday@!@#4"
    Then I will click on next