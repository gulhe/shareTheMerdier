package org.fnac.yams;

public enum Combination {
    SIMPLE(1),
    PAIRE(3),
    BRELAN(5),
    CARRÉ(10),
    YAM(20);

    private final Integer score;

    Combination(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }
}
