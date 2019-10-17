package com.github.matjanko.engineer.concrete.cover.domain.concrete;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ConcreteFactoryTest {

    private ConcreteFactory concreteFactory = new ConcreteFactory();

    @Test
    @Parameters({ "C12/15", "C16/20", "C20/25", "C25/30", "C30/37", "C35/45", "C40/50", "C45/55", "C50/60" })
    public void createConcreteCorrectStrengthNameTest(String input) {
        createConcreteTest(input);
    }

    private void createConcreteTest(String strengthClass) {
        //given
        Concrete concrete = concreteFactory.createConcrete(strengthClass, 32);

        //then
        Assert.assertEquals(strengthClass, concrete.getStrengthClassName());
    }
}
