package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import components.Position;
import exception.InvalidInputException;

/**
 * this is a buffer reader that take start and end position from console input
 */

public class BufferReader {
	private Position startPos;
	private Position endPos;

	public BufferReader() {

	}

	/**
	 * start the buffer reader which ask user to input position, and the record
	 * them
	 */
	public void start() {
		System.out.println("Please enter the start postion and end position ");

		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
					System.in));
			String str = bufferRead.readLine();
			String[] splited = str.split(" ");

			// set the position to the input if it's valid
			// check there is only two element in the input string
			if (splited.length == 2) {
				startPos = new PositionImpl(splited[0]);
				endPos = new PositionImpl(splited[1]);
			} else {
				throw new InvalidInputException(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			System.out
					.println("Sorry the input is not vaild: '" + e.getInput() + "'");
			e.printStackTrace();
		}
	}

	/**
	 * return the start position
	 */
	public Position getStartPos() {
		return this.startPos;
	}

	/**
	 * return the end position
	 */
	public Position getEndPos() {
		return this.endPos;
	}
}
