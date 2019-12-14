package org.example.exception;

public class IllegalWallThicknessValueException extends IllegalArgumentException {

    public IllegalWallThicknessValueException(int value, int minAllowed, int maxAllowed) {
        super("Illegal wall thilness value: " + value
                + ". It must not be greater than: " + maxAllowed
                + " and not less than: " + minAllowed);
    }
}