/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.cover;

import com.github.matjanko.engineer.concrete.cover.domain.bar.ReinforcingBar;
import com.github.matjanko.engineer.concrete.cover.domain.concrete.Concrete;

public class BondMinimumCover {
    private final ReinforcingBar bar;
    private final Concrete concrete;

    public BondMinimumCover(ReinforcingBar bar, Concrete concrete) {
        this.bar = bar;
        this.concrete = concrete;
    }

    public int getCover() {
        int cover = bar.getDiameter();

        if (concrete.getMaxAggregateSize() > 32) {
            cover += 5;
        }

        return cover;
    }
}
