package org.example.builder;

public class DimensionInMillimetres implements Dimension{

    private final int value;

    public DimensionInMillimetres(int value) {
        this.value = value;
    }

    @Override
    public int getValueInMillimetres() {
        return value;
    }
}
