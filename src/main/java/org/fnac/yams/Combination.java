package org.fnac.yams;

import java.util.Locale;

public enum Combination {
    SIMPLE(1),
    PAIRE(3),
    DOUBLE_PAIRE(4),
    BRELAN(5),
    SUITE(7),
    FULL(8),
    CARRÉ(10),
    YAM(20);

    private final Integer score;

    Combination(Integer score) {
        this.score = score;
    }

    public static Combination fromFunctionalValue(String pCombination) {
        return Combination.valueOf(pCombination.toUpperCase(Locale.FRENCH).replaceAll("-","_"));
    }

    public Integer getScore() {
        return score;
    }
}
