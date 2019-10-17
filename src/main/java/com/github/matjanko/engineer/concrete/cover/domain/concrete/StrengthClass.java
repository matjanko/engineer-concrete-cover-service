package com.github.matjanko.engineer.concrete.cover.domain.concrete;

public enum StrengthClass {
    C12_15("C12/15"),
    C16_20("C16/20"),
    C20_25("C20/25"),
    C25_30("C25/30"),
    C30_37("C30/37"),
    C35_45("C35/45"),
    C40_50("C40/50"),
    C45_55("C45/55"),
    C50_60("C50/60");

    private final String name;

    StrengthClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
