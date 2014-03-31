package Implementation;

import java.util.List;

import components.Board;
import components.Pieces;
import components.Position;

public class MoveCalculator {
	private Position nextMove = null;
	private double shortestDis = 100;

	public MoveCalculator() {

	}

	public Position getNextMove(Board board, Pieces piece) {

		Position currentPos = board.getPos(piece);
		Position endPos = board.getEndPos();
		List<Position> possibleMoves = piece.getValidMove(currentPos);

		for (Position pm : possibleMoves) {
			/**
			 * get the distance between next possible position and target position
			 */
			double disOfNE = Math.sqrt(Math.pow(
					endPos.getColumnPos() - pm.getColumnPos(), 2)
					+ Math.pow(endPos.getRowPos() - pm.getRowPos(), 2));

			/**
			 * get the distance between current position and target position
			 */
			double disOfCE = Math.sqrt(Math.pow(
					endPos.getColumnPos() - currentPos.getColumnPos(), 2)
					+ Math.pow(endPos.getRowPos() - currentPos.getRowPos(), 2));

			/**
			 * for the situation that the distance between current position and target
			 * is 2
			 */
			if (disOfCE == 2) {
				if (disOfNE == Math.sqrt(5)) {
					nextMove = pm;
				}
			}
			/**
			 * for the situation that the distance between current position and target
			 * is sqrt5
			 */
			else if (disOfCE == Math.sqrt(5)) {
				if (disOfNE == 0) {
					nextMove = pm;
				}
			}
			/**
			 * for the situation that the distance between current position and target
			 * is 1
			 */
			else if (disOfCE == 1) {
				if (disOfNE == 2) {
					nextMove = pm;
				}
			} else {
				if (disOfNE < shortestDis) {
					shortestDis = disOfNE;
					nextMove = pm;
				}
			}
		}
		return nextMove;
	}
}
