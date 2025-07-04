@tag
Feature: Search feature
  I want to validate the search functionality

  @tag1
  Scenario: Validate search
    Given I am on the website
    And I input a product in the search bar
    When I click the search button
    Then I expect to see the expected search results

  @tag2
  Scenario Outline: Sort products
    Given I click on the sorting feature
    When I click on a sort of product
    Then I verify the results
    
    @tag3
  Scenario Outline: Clicking products and verifying details
    Given I have browsed products
    When I click on the quick view
    Then I verify the specific details
    
    @tag4
  Scenario Outline: Comparing products
    Given I have browsed products
    When I select two products
    And I click to compare
    Then I verify the outcomes
    
    @tag5
  Scenario Outline: Applying filters
    Given I have browsed products
    When I apply filters
    Then I verify the expected results