/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.structuralclass;

import com.github.matjanko.engineer.concrete.cover.domain.concrete.Concrete;
import com.github.matjanko.engineer.concrete.cover.domain.concrete.StrengthClass;
import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static com.github.matjanko.engineer.concrete.cover.domain.concrete.StrengthClass.*;
import static com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass.*;

public class StructuralClass {
    private final ExposureClass exposureClass;
    private final ElementType elementType;
    private final Concrete concrete;
    private final boolean isHundredYearsServiceLife;
    private final boolean isSpecialQualityControl;

    private static Map<ExposureClass, StrengthClass> exposureClassStrengthClassMap =
            getExposureClassStrengthClassMap();

    public StructuralClass(ExposureClass exposureClass, ElementType elementType, Concrete concrete,
                           boolean isHundredYearsServiceLife, boolean isSpecialQualityControl) {
        this.exposureClass = exposureClass;
        this.elementType = elementType;
        this.concrete = concrete;
        this.isHundredYearsServiceLife = isHundredYearsServiceLife;
        this.isSpecialQualityControl = isSpecialQualityControl;
    }

    public StructuralClassMark getMark() {
        return StructuralClassMark.getMark(getCounter());
    }

    private int getCounter() {
        int counter = 4;

        counter = getCounterDueToServiceLife(counter);
        counter = getCounterDueToElementType(counter);
        counter = getCounterDueToStrengthClass(counter);
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

    private int getCounterDueToStrengthClass(int actualCounter) {
        int minCompressiveStrength = exposureClassStrengthClassMap.entrySet().stream()
                .filter(exp -> exp.getKey() == exposureClass)
                .map(sc -> sc.getValue().getCompressiveStrength())
                .findAny()
                .orElseThrow(NoSuchElementException::new);

        if (concrete.getCharacteristicCompressiveStrength() >= minCompressiveStrength) {
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

    private static Map<ExposureClass, StrengthClass> getExposureClassStrengthClassMap() {
        Map<ExposureClass, StrengthClass> map = new HashMap<>();

        map.put(XC0, C30_37);
        map.put(XC1, C30_37);
        map.put(XC2, C35_45);
        map.put(XC3, C35_45);
        map.put(XC4, C40_50);

        map.put(XD1, C40_50);
        map.put(XD2, C40_50);
        map.put(XD3, C45_55);

        map.put(XS1, C40_50);
        map.put(XS2, C45_55);
        map.put(XS3, C45_55);

        map.put(XF1, C30_37);
        map.put(XF2, C35_45);
        map.put(XF3, C35_45);
        map.put(XF4, C40_50);

        map.put(XA1, C30_37);
        map.put(XA2, C35_45);
        map.put(XA3, C35_45);

        return map;
    }
}
