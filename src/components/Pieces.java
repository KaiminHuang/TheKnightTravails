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
	 *  @return The valid moves of piece.
	 *  @param current position
	 */
	public List<Position> getValidMove(Position pos);
	
}