package Implementation;

import components.Board;
import components.Pieces;
import components.Position;

public class BoardImpl implements Board{
	private Position startPos;
	private Position endPos;
	int rowLength;
	int colLength;
	
	public BoardImpl(){
		this.colLength = 8;
		this.rowLength = 8;
	}
	
	@Override
	public Pieces getPiece(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emptyBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialPosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPiece(Pieces piece, Position position) {
		// TODO Auto-generated method stub
		piece.setPos(position);
	}
	public void setEndPos(Position endPos) {
		// TODO Auto-generated method stub
		this.endPos = endPos;
	}

	public Position getEndPos() {
		// TODO Auto-generated method stub
		return this.endPos;
	}
}
