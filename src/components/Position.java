package components;

import exception.InvalidInputException;

public interface Position {
	/**
	 * @return The columns position. (A-H)
	 */
	public int getColumnPos();
	/**
	 * Set The column position
	 * @param a integer indicates column position (A-H).
	 * @throws InvalidInputException 
	 */
	public void setColumnPos(String pos) throws InvalidInputException;
	/**
	 * @return The row position. (1-8)
	 */
	public int getRowPos();
	/**
	 * Set The column position
	 * @param a Integer indicates row position (1-8).
	 * @throws InvalidInputException 
	 */
	public void setRowPos(String pos) throws InvalidInputException;
	
	/**
	 * @return The position in string
	 */
	public String getStringPos();

}
