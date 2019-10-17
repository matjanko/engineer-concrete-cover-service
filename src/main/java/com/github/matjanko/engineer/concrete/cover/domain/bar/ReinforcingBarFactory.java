/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

public class ReinforcingBarFactory {
    public ReinforcingBar createReinforcingBar(int diameter) {

        BarDiameterType barDiameterType = BarDiameterType.getType(diameter);
        return new ReinforcingBar(barDiameterType);
    }
}
