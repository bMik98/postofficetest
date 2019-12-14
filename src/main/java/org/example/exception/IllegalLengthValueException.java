package org.example.exception;

public class IllegalLengthValueException extends IllegalArgumentException {

    public IllegalLengthValueException(int value, int minAllowedValue) {
        super("Illegal heightIllegalHeightValueException value: " + value + ". It must be greater than: " + minAllowedValue);
    }
}
