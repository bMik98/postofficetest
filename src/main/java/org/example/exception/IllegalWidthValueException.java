package org.example.exception;

public class IllegalWidthValueException extends IllegalArgumentException {

    public IllegalWidthValueException(int value, int minAllowedValue) {
        super("Illegal width value: " + value + ". It must be greater than: " + minAllowedValue);
    }
}
