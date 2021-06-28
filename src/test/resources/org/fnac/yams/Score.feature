Feature: Scoring system
  As a Yams player
  I want to be able to tell hom many points I did for a given combination
  In order to update the score board when there will be one

  NOTE : This should be a persona later ...

  Scenario Outline: If <combination> is rolled the <score> is scored
    Given a <combination> is scored
    Then it accounts for <score> points

    Examples:
      | combination | score |
      | simple      | 1       |
      | paire       | 3       |
      | brelan      | 5       |
      | carré       | 10      |
      | Yam         | 20      |
