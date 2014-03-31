package exception;

import java.io.*;

/**
 * An exception that occurs when the position is out of the boundary of a board
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