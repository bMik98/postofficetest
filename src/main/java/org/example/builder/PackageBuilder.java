package org.example.builder;

import org.example.exception.IllegalHeightValueException;
import org.example.exception.IllegalLengthValueException;
import org.example.exception.IllegalWidthValueException;
import org.example.model.Package;

public class PackageBuilder {

    public static final int MIN_SPACE_IN_MILLIMETRES = 5;
    public static final int MAX_SPACE_IN_MILLIMETRES = 5000;

    private int length;
    private int width;
    private int height;

    public PackageBuilder() {
        this.length = MIN_SPACE_IN_MILLIMETRES;
        this.width = MIN_SPACE_IN_MILLIMETRES;
        this.height = MIN_SPACE_IN_MILLIMETRES;
    }

    public PackageBuilder length(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalLengthValueException(value, MIN_SPACE_IN_MILLIMETRES, MAX_SPACE_IN_MILLIMETRES);
        }
        this.length = value;
        return this;
    }

    public PackageBuilder width(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalWidthValueException(value, MIN_SPACE_IN_MILLIMETRES, MAX_SPACE_IN_MILLIMETRES);
        }
        this.width = value;
        return this;
    }

    public PackageBuilder height(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalHeightValueException(value, MIN_SPACE_IN_MILLIMETRES,MAX_SPACE_IN_MILLIMETRES);
        }
        this.height = value;
        return this;
    }

    public Package build() {
        return new Package(length, width, height);
    }
}
