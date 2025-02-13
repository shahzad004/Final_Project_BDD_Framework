@contactrequest
Feature:  Explore Website
  Scenario: Contact Menu in Website
    Given we are on landing page
    When  I will click on ContactMenu
    Then I will go to contact page
    Then  I will enter firstname in namefield "John"
    Then I will enter lastname in lastnamefield "Khan"
    Then  I will enter work email "khan074@gmail.com" ,job title "Automation Engineer"
    Then I wil enter phone number
    Then I will enter company name "Tekschool"
    Then I will select company size
    Then I will select skills
    Then  I will wirte some information
    Then I will click on submit