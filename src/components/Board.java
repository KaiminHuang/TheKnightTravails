package components;

public interface Board {
	/**
	 * This interface has to be implemented by any board implementation.
	 */

	/**
	 * Get the piece of a given position.
	 * 
	 * @param position
	 *          The position of the piece.
	 * 
	 * @return The piece on that position, or null if the square is empty.
	 */
	public Pieces getPiece(Position position);

	/**
	 * Remove all the pieces from the board.
	 */
	public void emptyBoard();

	/**
	 * Set the pieces to their initial positions.
	 */
	public void initialPosition();

	/**
	 * Set a piece on a given position.
	 * 
	 * @param piece
	 *          The piece to set.
	 * @param position
	 *          The position to set the piece on.
	 */
	public void setPiece(Pieces piece, Position position);

	/**
	 * Set the end/target position.
	 * @param position of the target
	 */
	public void setEndPos(Position endPos);
	
	/**
	 * Get the end/target position.
	 */
	public Position getEndPos();
	
	/**
	 * Move a piece from one square to another.
	 * 
	 * @param ply
	 *          The move to perform.
	 */
//	public void doPly(Ply ply);

	/**
	 * Return a new board, that results from a given ply.
	 * 
	 * @param ply
	 *          The ply to perform.
	 * 
	 * @return A new board with the game position after the ply.
	 */
//	public Cheeseboard getBoardAfterPly(Ply ply);
}
