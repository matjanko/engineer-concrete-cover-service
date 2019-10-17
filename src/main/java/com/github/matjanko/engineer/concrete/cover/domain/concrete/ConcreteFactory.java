package com.github.matjanko.engineer.concrete.cover.domain.concrete;

public class ConcreteFactory {

    public Concrete createConcrete(String strengthClass, int maxAggregateSize) {

        StrengthClass strengthClassType = StrengthClass.getStrengthClass(strengthClass);
        return new Concrete(strengthClassType, maxAggregateSize);
    }
}
