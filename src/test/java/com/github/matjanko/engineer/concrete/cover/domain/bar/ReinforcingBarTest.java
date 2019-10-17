package com.github.matjanko.engineer.concrete.cover.domain.bar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReinforcingBarTest {

    private ReinforcingBarFactory reinforcingBarFactory;

    @Before
    public void before() {
        reinforcingBarFactory = new ReinforcingBarFactory();
    }

    @Test
    public void createReinforcingBarTest() {
        //given
        ReinforcingBar bar = reinforcingBarFactory.createReinforcingBar(BarDiameter.FI_10);
        int expectedDiameter = 10;

        //when
        int actualDiameter = bar.getDiameter();

        //then
        Assert.assertEquals(expectedDiameter, actualDiameter);
    }
}
