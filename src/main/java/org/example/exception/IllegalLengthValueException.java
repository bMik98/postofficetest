package org.example.exception;

public class IllegalLengthValueException extends IllegalArgumentException {

    public IllegalLengthValueException(int value, int minAllowed, int maxAllowed) {
        super("Illegal length value: " + value
                + ". It must not be greater than: " + maxAllowed
                + " and not less than: " + minAllowed);
    }
}
