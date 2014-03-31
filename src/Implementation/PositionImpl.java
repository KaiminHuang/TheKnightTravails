package Implementation;

import components.Position;
import exception.InvalidInputException;

public class PositionImpl implements Position {
	private int ColumnPos = -1;
	private int RowPos = -1;
	// create a new position according to a string
	public PositionImpl(String str) throws InvalidInputException {
		if (isValid(str)) {
			this.ColumnPos = Character.toUpperCase(str.charAt(0)) - 'A' + 1;
			this.RowPos = Character.getNumericValue(str.charAt(1));
		} else {
			throw new InvalidInputException(str);
		}
	}
	//create a new position according to two integer
	public PositionImpl(int rowPos, int colPos) {
		if (isValid(rowPos, colPos)) {
			this.ColumnPos = colPos;
			this.RowPos = rowPos;
		}
	}

	@Override
	public int getColumnPos() {
		// TODO Auto-generated method stub
		return this.ColumnPos;
	}

	@Override
	public void setColumnPos(String pos) throws InvalidInputException {
		// TODO Auto-generated method stub
		if (isValid(pos)) {
			this.ColumnPos = Character.toUpperCase(pos.charAt(0)) - 'A' + 1;
		} else {
			throw new InvalidInputException(pos);
		}

	}

	@Override
	public int getRowPos() {
		// TODO Auto-generated method stub
		return this.RowPos;
	}

	@Override
	public void setRowPos(String pos) throws InvalidInputException {
		// TODO Auto-generated method stub
		if (isValid(pos)) {
			this.RowPos = Integer.parseInt(pos);
		} else {
			throw new InvalidInputException(pos);
		}
	}

	@Override
	public String getStringPos() {
		// TODO Auto-generated method stub
		String col = String.valueOf((char) (this.ColumnPos + 64));
		return (col + String.valueOf(this.RowPos));
	}

	// check whether str is a valid position as (a-z)(1-8)
	private boolean isValid(String str) {
		if (str.length() == 2) {
			return str.matches("^[a-zA-Z][1-8]$");
		} else {
			return false;
		}
	}

	// check whether position is a valid position as (1-8)(1-8)
	private boolean isValid(int rowPos, int colPos) {
		if (rowPos >= 1 && rowPos <= 8 && colPos >= 1 && colPos <= 8) {
			return true;
		} else {
			return false;
		}
	}
}
