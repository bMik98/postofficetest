package org.example.exception;

public class IllegalHeightValueException extends IllegalArgumentException {

    public IllegalHeightValueException(int value, int minAllowedValue) {
        super("Illegal height value: " + value + ". It must be greater than: " + minAllowedValue);
    }
}
