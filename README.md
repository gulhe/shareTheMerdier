# YAM'S !!

## Description générale

Le Yam's est un est jeu qui se joue avec 5 dés.
Le résultat de ces 5 dés permet d'obtenir des combinaisons.
Chaque combinaison vaut un nombre de point.

## Règles

### Score
- aucune combinaison = 1 point
- 2 dés identiques (paire) = 3 points
- 2 fois 2 dés identiques (double paire) = 4 points
- 3 dés identiques (brelan) = 5 points
- 5 dés qui se suivent(suite) = 7 points
- 1 brelan + 1 paire (full) = 8 points
- 4 dés identiques (carré) = 10 points
- 5 dés identiques (yam) = 20 points

Pour plus de détail [aller directement à la spec](src/test/resources/org/fnac/yams/Score.feature "Gherkin rules").

### Combinaisons
Les combinaisons se déterminent assez naturellement mais [pour plus de détails voyez la spec directement](src/test/resources/org/fnac/yams/Combination.feature "Gherkin rules HARD").
