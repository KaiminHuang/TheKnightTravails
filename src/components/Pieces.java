package components;

import java.util.List;

/**
 * A Knight moves two steps in a straight line from 
 * its starting position, and then one square to 
 * either the left or right
 * 
 * @author kaimin huang
 */

public interface Pieces {
	/**
	 * Set The current position of knights
	 * @param a position
	 */
	public void setPos(Position pos);
	
	/**
	 * @return The current position of the knight
	 */
	public Position getPos();
	
	/**
	 *  @return The valid moves of piece.
	 *  @param current position
	 */
	public List<Position> getValidMove(Position pos);
	
}