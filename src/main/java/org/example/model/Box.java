package org.example.model;

public class Box {

    private final int length;
    private final int width;
    private final int height;
    private final int wallThickness;

    public Box(int length, int width, int height, int wallThickness) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.wallThickness = wallThickness;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWallThickness() {
        return wallThickness;
    }
}
