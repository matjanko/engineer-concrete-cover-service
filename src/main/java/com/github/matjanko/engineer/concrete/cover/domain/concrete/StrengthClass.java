package com.github.matjanko.engineer.concrete.cover.domain.concrete;

import java.util.stream.Stream;

public enum StrengthClass {
    C12_15, C16_20, C20_25, C25_30, C30_37, C35_45, C40_50, C45_55, C50_60;

    @Override
    public String toString() {
        return this.name().replace("_", "/");
    }

    public int getCompressiveStrength() {
        return Integer.parseInt(this.name().substring(1, 3));
    }

    public static StrengthClass getStrengthClass(String name) {
        return Stream.of(StrengthClass.values())
                .filter(s -> s.toString().equals(name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Invalid concrete strength class %s.", name)));
    }
}
