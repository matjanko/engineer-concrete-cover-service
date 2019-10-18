/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.structuralclass;

import java.util.stream.Stream;

public enum StructuralClassMark {
    S1, S2, S3, S4, S5, S6;

    private int getCounter() {
        return Integer.parseInt(this.name().substring(2));
    }

    public static StructuralClassMark getMark(int counter) {
        return Stream.of(StructuralClassMark.values())
                .filter(sc -> sc.getCounter() == counter)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Invalid counter."));
    }
}
