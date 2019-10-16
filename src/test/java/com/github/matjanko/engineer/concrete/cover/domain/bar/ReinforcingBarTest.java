package com.github.matjanko.engineer.concrete.cover.domain.bar;

import org.junit.Assert;
import org.junit.Test;

public class ReinforcingBarTest {

    @Test
    public void shouldReturnTenFromReinforcingBarDiameterF10() {
        // given
        ReinforcingBar bar = new ReinforcingBar(Diameter.FI_10);
        int expectedDiameter = 10;

        // when
        int actualDiameter = bar.getDiameter();

        // then
        Assert.assertEquals(expectedDiameter, actualDiameter);
    }
}
