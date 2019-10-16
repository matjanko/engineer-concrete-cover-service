package com.github.matjanko.engineer.concrete.cover.domain.bar;

public class ReinforcingBar {
    private final Diameter diameter;

    public ReinforcingBar(Diameter diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter.getValue();
    }
}
