/**
 * @author matjanko
 */
package com.github.matjanko.engineer.concrete.cover.infrastructure.repositories;

import com.github.matjanko.engineer.concrete.cover.domain.cover.EnvironmentMinCover;
import com.github.matjanko.engineer.concrete.cover.domain.cover.EnvironmentMinCoverRepository;
import com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass;
import com.github.matjanko.engineer.concrete.cover.domain.structuralclass.StructuralClassMark;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.github.matjanko.engineer.concrete.cover.domain.exposure.ExposureClass.*;
import static com.github.matjanko.engineer.concrete.cover.domain.structuralclass.StructuralClassMark.*;


public class EnvironmentMinCoverRepositoryImp implements EnvironmentMinCoverRepository {

    private static List<EnvironmentMinCover> reinforcedSteelEnvironmentMinCovers =
            getReinforcedSteelEnvironmentMinCovers();

    @Override
    public int getCover(StructuralClassMark structuralClassMark, ExposureClass exposureClass) {
        return 0;
    }

    private static List<EnvironmentMinCover> getReinforcedSteelEnvironmentMinCovers() {
        List<EnvironmentMinCover> covers = new LinkedList<>();

        covers.add(new EnvironmentMinCover(S1, new LinkedList<>(
                Arrays.asList(XC0, XC1, XC2, XC3, XA1, XA2, XA3, XF1, XF2, XF3)), 10));
        covers.add(new EnvironmentMinCover(S1, new LinkedList<>(Arrays.asList(XC4)), 15));
        covers.add(new EnvironmentMinCover(S1, new LinkedList<>(Arrays.asList(XD1, XS1)), 20));
        covers.add(new EnvironmentMinCover(S1, new LinkedList<>(Arrays.asList(XD2, XS2)), 25));
        covers.add(new EnvironmentMinCover(S1, new LinkedList<>(Arrays.asList(XD3, XS3)), 30));

        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XC0, XC1, XA1, XF1)), 10));
        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XC2, XC3, XA2, XA3, XF2, XF3)), 15));
        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XC4)), 20));
        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XD1, XS1)), 25));
        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XD2, XS2)), 30));
        covers.add(new EnvironmentMinCover(S2, new LinkedList<>(Arrays.asList(XD3, XS3)), 35));

        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XC0, XC1, XA1, XF1)), 10));
        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XC2, XC3, XA2, XA3, XF2, XF3)), 20));
        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XC4)), 25));
        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XD1, XS1)), 30));
        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XD2, XS2)), 35));
        covers.add(new EnvironmentMinCover(S3, new LinkedList<>(Arrays.asList(XD3, XS3)), 40));

        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XC0)), 10));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XC1, XA1, XF1)), 15));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XC2, XC3, XA2, XA3, XF2, XF3)), 25));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XC4)), 30));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XD1, XS1)), 35));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XD2, XS2)), 40));
        covers.add(new EnvironmentMinCover(S4, new LinkedList<>(Arrays.asList(XD3, XS3)), 45));

        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XC0)), 15));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XC1, XA1, XF1)), 20));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XC2, XC3, XA2, XA3, XF2, XF3)), 30));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XC4)), 35));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XD1, XS1)), 40));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XD2, XS2)), 45));
        covers.add(new EnvironmentMinCover(S5, new LinkedList<>(Arrays.asList(XD3, XS3)), 50));

        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XC0)), 20));
        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XC1, XA1, XF1)), 25));
        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XC2, XC3, XA2, XA3, XF2, XF3)), 35));
        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XC4)), 40));
        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XD1, XS1)), 45));
        covers.add(new EnvironmentMinCover(S6, new LinkedList<>(Arrays.asList(XD2, XS2, XD3, XS3)), 55));

        return covers;
    }
}
