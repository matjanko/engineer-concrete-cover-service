/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

public class ReinforcingBar {
    private final BarDiameterType diameterType;

    public ReinforcingBar(BarDiameterType diameterType) {
        this.diameterType = diameterType;
    }

    public int getDiameter() {
        return diameterType.getValue();
    }
}
