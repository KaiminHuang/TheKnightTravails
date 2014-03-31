import java.util.ArrayList;
import java.util.List;

import components.Board;
import components.Pieces;
import components.Position;

import Implementation.BoardImpl;
import Implementation.BufferReader;
import Implementation.KnightImpl;
import Implementation.MoveCalculator;

import exception.OutOfBoardException;

/**
 * this is a game that take 2 inputs as start position and end position on a
 * cheese board, return knight path between these two position
 * 
 * @author kaimin huang
 */
public class Game {
	public static void main(String[] args) {

		Position startPos; // indicates the start position
		Position endPos; // indicates the end position
		Position nextPos; // indicates the next position
		List<Position> path = new ArrayList<Position>(); // indicates the path of
																											// knight

		KnightImpl knight = new KnightImpl();
		Board board = new BoardImpl();
		BufferReader bufferReader = new BufferReader();
		MoveCalculator moveCal = new MoveCalculator();

		// ask user to input the start and end position
		// and then get them from buffer generator
		bufferReader.start();
		startPos = bufferReader.getStartPos();
		endPos = bufferReader.getEndPos();

		// initialize the knight at the given position
		board.initiaSetPiece(knight, startPos);
		board.setEndPos(endPos);

		// check whether the knight is already at the end position
		while (!board.isReachEnd(knight)) {
			// calculate the next position, and move the piece
			nextPos = moveCal.getNextMove(board, knight);
			board.movePiece(knight, nextPos);
			path.add(nextPos);

		}
		// print out the path of the knight
		System.out.print("path --> ");
		for (Position p : path) {
			System.out.print(p.getStringPos());
		}
		System.out.print("\n");
	}
}