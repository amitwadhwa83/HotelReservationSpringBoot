package com.example.demo.exception;

public class InsufficientFundsException extends GenericException {
    public InsufficientFundsException() {
	super("Insufficient funds in source account");
    }
}
