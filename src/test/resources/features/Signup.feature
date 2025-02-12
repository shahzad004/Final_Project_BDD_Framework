@signup
Feature: Sign up for Monday website
  Scenario: lets try sign up
    Given I am on signup area
    When I will click on getStarted
    Then my email "shahzad.Paktiawal@tekschool.us"
    Then  I will click on next
    Then I will enter details "Shahzad","Tekschoo!@#4", "TEKSCHOOL"
    Then I will click on next