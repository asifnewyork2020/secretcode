
@tag
Feature: Signing in to Amazon Account

  @tag1
  Scenario: Valid successful Sign in
    Given I am on Amazon homepage
    When I put my "<emailaddress>"
    And I click on continue button
    And I am on amazon password page
    Then I am putting my "<password>" 
    And I click on sign in button 



    Examples: 
      | emailaddress             | password         |
      |asifnewyork2020@gmail.com |Dhanmondi8122365$ |
      
