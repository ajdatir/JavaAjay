Feature: Orange Hrm Feature File

  Scenario Outline: Validate Login Scenario
    Given I enter the "<Username>"
    And I enter "<Password>"
    And click login button

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |
