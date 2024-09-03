package com.nt.dice;

public class DiceRollerResult {
    private final int rollResult;
    private final int rollMin;
    private final int rollMax;

    public DiceRollerResult(int rollResult, int rollMin, int rollMax) {
        this.rollResult = rollResult;
        this.rollMin = rollMin;
        this.rollMax = rollMax;
    }

    public int getRollResult() {
        return rollResult;
    }

    public int getRollMin() {
        return rollMin;
    }

    public int getRollMax() {
        return rollMax;
    }
}
