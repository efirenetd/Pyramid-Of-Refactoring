package pl.refactoring.interpreter.emerging.specs;

import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

public class RangeAreaSpec implements Spec {
    private final float minArea;
    private final float maxArea;

    public RangeAreaSpec(float minArea, float maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() >= minArea
                && estate.getBuildingArea() <= maxArea;
    }
}
