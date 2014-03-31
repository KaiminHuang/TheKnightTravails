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
	 * Set a piece to initial positions.
	 * 
	 * @param piece
	 *          The piece to set.
	 * @param position
	 *          The position to set the piece on.
	 */
	public void initiaSetPiece(Pieces piece, Position position);
	
	/**
	 * move a piece to a given position.
	 * 
	 * @param piece
	 *          The piece to move.
	 * @param position
	 *          The new position of the piece.
	 */
	public void movePiece(Pieces piece, Position position);
	

	/**
	 * get the position of given piece.
	 * 
	 * @param the
	 *          piece that you want to know the position
	 */
	public Position getPos(Pieces piece);

	/**
	 * Set the end/target position.
	 * 
	 * @param position
	 *          of the target
	 */
	public void setEndPos(Position endPos);

	/**
	 * Get the end/target position.
	 */
	public Position getEndPos();

	/**
	 * check whether the piece is at the end position
	 * 
	 * @param piece
	 *          The target piece
	 * @return boolean
	 */
	public boolean isReachEnd(Pieces piece);

}
