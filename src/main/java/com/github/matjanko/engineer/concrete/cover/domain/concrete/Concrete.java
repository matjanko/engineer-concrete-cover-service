package com.github.matjanko.engineer.concrete.cover.domain.concrete;

public class Concrete {
    private final StrengthClass strengthClass;
    private final int maxAggregateSize;

    public Concrete(StrengthClass strengthClass, int maxAggregateSize) {
        this.strengthClass = strengthClass;
        this.maxAggregateSize = maxAggregateSize;
    }
}
