package exception;

import java.io.*;

import components.Position;

/**
 * A super class for all exceptions that occur in the baggage control.
 * 
 * @author Kaimin Huang
 */
// File Name InsufficientFundsException.java

public class InvalidInputException extends Exception {
	private String input;

	public InvalidInputException(String input) {
		this.input = input;
	}

	public String getInput() {
		return this.input;
	}
}