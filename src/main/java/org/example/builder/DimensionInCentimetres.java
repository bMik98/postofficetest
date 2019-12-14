package org.example.builder;

public class DimensionInCentimetres implements Dimension {

    private final int value;

    public DimensionInCentimetres(int value) {
        this.value = value;
    }

    @Override
    public int getValueInMillimetres() {
        return value * 10;
    }
}
