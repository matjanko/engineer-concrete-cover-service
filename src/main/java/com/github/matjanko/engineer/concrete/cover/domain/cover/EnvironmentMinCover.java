/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.cover;

import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;
import com.github.matjanko.engineer.concrete.cover.domain.structuralclass.StructuralClass;

public class EnvironmentMinCover {
    private final ExposureClass exposureClass;
    private final StructuralClass structuralClass;
    private final int cover;

    public EnvironmentMinCover(ExposureClass exposureClass, StructuralClass structuralClass, int cover) {
        this.exposureClass = exposureClass;
        this.structuralClass = structuralClass;
        this.cover = cover;
    }

    public ExposureClass getExposureClass() {
        return exposureClass;
    }

    public StructuralClass getStructuralClass() {
        return structuralClass;
    }

    public int getCover() {
        return cover;
    }
}
