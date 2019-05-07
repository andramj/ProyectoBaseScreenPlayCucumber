Feature: I as a user, I want to enter the amazon website
         and look for a product

  Scenario: I enter the amazon website and search a product
    Given I enter the amazon website
    When I search the product 'car'
    Then I verify that the product 'car' exists
