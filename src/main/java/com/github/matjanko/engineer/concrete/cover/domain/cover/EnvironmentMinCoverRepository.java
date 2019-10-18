/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.domain.cover;

import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;
import com.github.matjanko.engineer.concrete.cover.domain.structuralclass.StructuralClass;

public interface EnvironmentMinCoverRepository {

    int getCover(StructuralClass structuralClass, ExposureClass exposureClass);
}
