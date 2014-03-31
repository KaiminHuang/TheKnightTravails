package exception;

import java.io.*;

/**
 * A super class for all exceptions that occur in the baggage control.
 * 
 * @author Kaimin Huang
 */
// File Name InsufficientFundsException.java

public class OutOfBoardException extends Exception {
	private String pos;

	public OutOfBoardException(String pos) {
		this.pos = pos;
	}

	public String getPos() {
		return this.pos;
	}
}