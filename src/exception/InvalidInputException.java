package exception;

import java.io.*;

import components.Position;

/**
 * An exception that occurs when the input is not valid
 * which means it's not like [a-h][1-8]
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