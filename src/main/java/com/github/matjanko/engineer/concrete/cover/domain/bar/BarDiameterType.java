/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

import java.util.stream.Stream;

public enum BarDiameterType {
    FI_6(6),
    FI_8(8),
    FI_10(10),
    FI_12(12),
    FI_14(14),
    FI_16(16),
    FI_18(18),
    FI_20(20),
    FI_22(22),
    FI_25(25),
    FI_28(28),
    FI_32(32),
    FI_40(40);

    private final int value;

    BarDiameterType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BarDiameterType getType(int diameter) {
        return Stream.of(BarDiameterType.values())
                .filter(d -> d.value == diameter)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Invalid bar diameter %s.", diameter)));
    }
}
