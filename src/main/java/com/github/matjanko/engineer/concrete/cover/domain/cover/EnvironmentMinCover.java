/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.cover;

import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;
import com.github.matjanko.engineer.concrete.cover.domain.structuralclass.StructuralClassMark;

import java.util.List;

public class EnvironmentMinCover {
    private final StructuralClassMark structuralClassMark;
    private final List<ExposureClass> exposureClasses;
    private final int cover;

    public EnvironmentMinCover(StructuralClassMark structuralClassMark,
                               List<ExposureClass> exposureClasses, int cover) {
        this.structuralClassMark = structuralClassMark;
        this.exposureClasses = exposureClasses;
        this.cover = cover;
    }
}
