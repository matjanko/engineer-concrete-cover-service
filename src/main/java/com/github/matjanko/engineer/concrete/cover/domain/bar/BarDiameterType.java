/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

import java.util.stream.Stream;

public enum BarDiameterType {
    FI_6, FI_8, FI_10, FI_12, FI_14, FI_16, FI_18, FI_20, FI_22, FI_25, FI_28, FI_32, FI_40;

    public int getValue() { ;
        return Integer.parseInt(this.name().substring(3));
    }

    public static BarDiameterType getType(int diameter) {
        return Stream.of(BarDiameterType.values())
                .filter(d -> d.getValue() == diameter)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Invalid bar diameter %s.", diameter)));
    }
}
