/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.cover;

import com.github.matjanko.engineer.concrete.cover.domain.bar.ReinforcingBar;
import com.github.matjanko.engineer.concrete.cover.domain.bar.ReinforcingBarFactory;
import com.github.matjanko.engineer.concrete.cover.domain.concrete.Concrete;
import com.github.matjanko.engineer.concrete.cover.domain.concrete.ConcreteFactory;
import org.junit.Assert;
import org.junit.Test;

public class BondMinimumCoverTest {

    private ReinforcingBarFactory reinforcingBarFactory = new ReinforcingBarFactory();
    private ConcreteFactory concreteFactory = new ConcreteFactory();

    @Test
    public void getCoverWhenMaxAggregateSizeIsGraterThan32mmAndDiameterOfReinforcingBarIs32mm() {
        getCoverTest(32, 40, 37);
    }

    @Test
    public void getCoverWhenMaxAggregateSizeIsSmallerThan32mmAndDiameterOfReinforcingBarIs16mm() {
        getCoverTest(16, 20, 16);
    }

    @Test
    public void getCoverWhenMaxAggregateSizeIs32mmAndDiameterOfReinforcingBarIs20mm() {
        getCoverTest(20, 32, 20);
    }

    private void getCoverTest(int diameter, int maxAggregateSize, int expectedCover) {
        //given
        ReinforcingBar bar = reinforcingBarFactory.createReinforcingBar(diameter);
        Concrete concrete = concreteFactory.createConcrete("C25/30", maxAggregateSize);

        //when
        BondMinimumCover minimumCover = new BondMinimumCover(bar, concrete);
        int actualCover = minimumCover.getCover();

        //then
        Assert.assertEquals(expectedCover, actualCover);
    }
}
