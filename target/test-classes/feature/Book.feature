@cart
Feature: book checkout feature
  User Story: As a user I should be able to checkout a book on amazon.com

  Background: user lands on the main page
    Given user is on the front page

  Scenario: book checkout using search box scenario
    And user clicks on Hello, Sign in
    And user enters username in input box
    And user clicks on Continue
    And user enters password in input box
    And user click on Sign-In button
    And user searches for qa testing for beginners
    And user clicks on 1st item in the listed result
    Then user verifies price in Add to Cart page
    But user clicks on Add to Cart Button
    Then user verifies price in Proceed to Checkout page
    And user clicks on Proceed to Checkout
    Then user verifies price in Place Your Order page


