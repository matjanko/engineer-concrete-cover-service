/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

public class ReinforcingBarFactory {
    public ReinforcingBar createReinforcingBar(BarDiameter diameter) {
        //TODO validate

        return new ReinforcingBar(diameter.valueOf());
    }
}
