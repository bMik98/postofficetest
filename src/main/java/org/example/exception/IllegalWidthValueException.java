package org.example.exception;

public class IllegalWidthValueException extends IllegalArgumentException {

    public IllegalWidthValueException(int value, int minAllowed, int maxAllowed) {
        super("Illegal width value: " + value
                + ". It must not be greater than: " + maxAllowed
                + " and not less than: " + minAllowed);
    }
}