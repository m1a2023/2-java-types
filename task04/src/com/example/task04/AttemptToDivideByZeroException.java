package com.example.task04;

public class AttemptToDivideByZeroException extends ArithmeticException{
    AttemptToDivideByZeroException() {
        super("Attempt to divide by zero");
    }
    AttemptToDivideByZeroException(String message) {
        super(message);
    }
}
