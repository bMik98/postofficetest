package org.example.builder;

import org.example.exception.IllegalHeightValueException;
import org.example.exception.IllegalLengthValueException;
import org.example.exception.IllegalWallThicknessValueException;
import org.example.exception.IllegalWidthValueException;
import org.example.model.Box;

public class BoxBuilder {

    public static final int MIN_SPACE_IN_MILLIMETRES = 5;
    public static final int MAX_SPACE_IN_MILLIMETRES = 5000;
    public static final int MIN_WALL_THICKNESS_IN_MILLIMETRES = 1;
    public static final int MAX_WALL_THICKNESS_IN_MILLIMETRES = 50;

    private int length;
    private int width;
    private int height;
    private int wallThickness;

    public BoxBuilder() {
        this.length = MIN_SPACE_IN_MILLIMETRES;
        this.width = MIN_SPACE_IN_MILLIMETRES;
        this.height = MIN_SPACE_IN_MILLIMETRES;
        this.wallThickness = MIN_WALL_THICKNESS_IN_MILLIMETRES;
    }

    public BoxBuilder length(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalLengthValueException(value, MIN_SPACE_IN_MILLIMETRES, MAX_SPACE_IN_MILLIMETRES);
        }
        this.length = value;
        return this;
    }

    public BoxBuilder width(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalWidthValueException(value, MIN_SPACE_IN_MILLIMETRES, MAX_SPACE_IN_MILLIMETRES);
        }
        this.width = value;
        return this;
    }

    public BoxBuilder height(int value) {
        if (value < MIN_SPACE_IN_MILLIMETRES || value > MAX_SPACE_IN_MILLIMETRES) {
            throw new IllegalHeightValueException(value, MIN_SPACE_IN_MILLIMETRES, MAX_SPACE_IN_MILLIMETRES);
        }
        this.height = value;
        return this;
    }

    public BoxBuilder wallThickness(int value) {
        if (value < MIN_WALL_THICKNESS_IN_MILLIMETRES || value > MAX_WALL_THICKNESS_IN_MILLIMETRES) {
            throw new IllegalWallThicknessValueException(
                    value, MIN_WALL_THICKNESS_IN_MILLIMETRES, MAX_WALL_THICKNESS_IN_MILLIMETRES);
        }
        this.wallThickness = value;
        return this;
    }

    public Box build() {
        return new Box(length, width, height, wallThickness);
    }
}
