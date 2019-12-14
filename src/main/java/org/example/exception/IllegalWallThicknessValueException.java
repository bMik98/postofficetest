package org.example.exception;

public class IllegalWallThicknessValueException extends IllegalArgumentException {

    public IllegalWallThicknessValueException(int value, int minAllowedValue) {
        super("Illegal wall thickness value: " + value + ". It must be greater than: " + minAllowedValue);
    }
}
