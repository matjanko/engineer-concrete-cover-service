/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.structuralclass;

import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;

public class StructuralClass {
    private final ExposureClass exposureClass;
    private final ElementType elementType;
    private final boolean isHundredYearsServiceLife;
    private final boolean isSpecialQualityControl;

    public StructuralClass(ExposureClass exposureClass, ElementType elementType,
                           boolean isHundredYearsServiceLife, boolean isSpecialQualityControl) {
        this.exposureClass = exposureClass;
        this.isHundredYearsServiceLife = isHundredYearsServiceLife;
        this.isSpecialQualityControl = isSpecialQualityControl;
        this.elementType = elementType;
    }

    public StructuralClassType getStructuralClass() {
        return StructuralClassType.getType(getCounter());
    }

    private int getCounter() {
        int counter = 4;

        counter = getCounterDueToServiceLife(counter);
        counter = getCounterDueToElementType(counter);
        counter = getCounterDueToSpecialQualityControl(counter);

        return counter;
    }

    private int getCounterDueToServiceLife(int actualCounter) {
        if (isHundredYearsServiceLife) {
            actualCounter += 2;
        }
        return actualCounter;
    }

    private int getCounterDueToElementType(int actualCounter) {
        if (elementType == ElementType.SLAB) {
            actualCounter -= 1;
        }
        return actualCounter;
    }

    private int getCounterDueToSpecialQualityControl(int actualCounter) {
        if (isSpecialQualityControl) {
            actualCounter -= 1;
        }
        return actualCounter;
    }
}
