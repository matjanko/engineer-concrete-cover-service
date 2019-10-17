/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.bar;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ReinforcingBarFactoryTest {

    private ReinforcingBarFactory reinforcingBarFactory = new ReinforcingBarFactory();

    @Test
    @Parameters({ "6", "8", "10", "12", "14", "16", "18", "20", "22", "25", "28", "32", "40" })
    public void createReinforcingBarCorrectDiameterTest(int input) {
        createReinforcingBarTest(input);
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({ "2", "1", "0", "-2", "23", "47"})
    public void createReinforcingBarInvalidDiameterTest(int input) {
        createReinforcingBarTest(input);
    }

    private void createReinforcingBarTest(int diameter) {
        //given
        ReinforcingBar bar = reinforcingBarFactory.createReinforcingBar(diameter);

        //then
        Assert.assertEquals(diameter, bar.getDiameter());
    }
}
