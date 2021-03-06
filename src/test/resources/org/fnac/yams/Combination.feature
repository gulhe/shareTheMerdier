Feature: Combination determination
  As a Yams player
  I want to be able to tell which combination I did on a dice roll
  In order to update the score board when there will be one

  Scenario Outline: If <roll> is rolled the <combination> is retained
    Given a <roll> is rolled
    Then it accounts for a <combination>

    Examples:
      | roll          | combination  |
      | 4, 2, 1, 3, 6 | simple       |
      | 2, 2, 1, 3, 5 | paire        |
      | 5, 5, 3, 3, 2 | double-paire |
      | 2, 2, 2, 3, 5 | brelan       |
      | 4, 5, 3, 2, 1 | suite        |
      | 5, 5, 5, 6, 6 | full         |
      | 2, 2, 2, 2, 5 | carré        |
      | 2, 2, 2, 2, 2 | yam          |
