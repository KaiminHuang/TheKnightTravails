import components.Board;
import components.Pieces;
import components.Position;

import Implementation.BoardImpl;
import Implementation.BufferReader;
import Implementation.KnightImpl;
import Implementation.MoveCalculator;

import exception.OutOfBoardException;

/**
 * A game that take 2 inputs as start position and end position on a cheese
 * board, return knight path between these two position
 * 
 * @author kaimin huang
 */
public class Game {
	public static void main(String[] args) {

		Position startPos;  // indicates the start position
		Position endPos;		// indicates the end position
		Position nextPos;		// indicates the next position
		
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
		board.setPiece(knight, startPos);
		board.setEndPos(endPos);

		System.out.print("start postion: " + startPos.getStringPos() + "\n");
		System.out.print("end postion: " + board.getEndPos().getStringPos()
				+ "\n");
				
		// set the knight on the start position
		while (!knight.getPos().getStringPos().equals(board.getEndPos().getStringPos())) {
			
			nextPos = moveCal.getNextMove(knight.getPos(),knight.getValidMove(knight.getPos()),
					board.getEndPos());
			board.setPiece(knight, nextPos);
			System.out.print("cuttent pos   ^"+knight.getPos().getStringPos()+"$"+"\n");
		}
		System.out.print("path --> ");
		// print out the path of the knight
		for (Position p : knight.getPath()) {
			System.out.print(p.getStringPos());
		}
	}
}
// print out the possible move of the knight
//for (Position p : knight.getValidMove(startPos)) {
//System.out.print(p.getStringPos());
//}