package Implementation;

import components.Board;
import components.Pieces;
import components.Position;

public class BoardImpl implements Board {
	private Position startPos;
	private Position endPos;
	int rowLength;
	int colLength;
	// an 2d array which indicates the board, and record what
	// piece on each square
	private Pieces[][] board;

	public BoardImpl() {
		this.colLength = 8;
		this.rowLength = 8;
		this.board = new Pieces[this.rowLength +1 ][this.colLength + 1];
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
	public void initiaSetPiece(Pieces piece, Position position) {
		// TODO Auto-generated method stub
		this.board[position.getRowPos()][position.getColumnPos()] = piece;
	}
	public void movePiece(Pieces piece, Position position) {
		// TODO Auto-generated method stub
		Position currentPos = getPos(piece);
		// first erase the piece on current position
		this.board[currentPos.getRowPos()][currentPos.getColumnPos()] = null;
		// then add it to the new position
		this.board[position.getRowPos()][position.getColumnPos()] = piece;
		
	}
	public void setEndPos(Position endPos) {
		// TODO Auto-generated method stub
		this.endPos = endPos;
	}

	public Position getEndPos() {
		// TODO Auto-generated method stub
		return this.endPos;
	}

	@Override
	public Position getPos(Pieces piece) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=this.rowLength; i++){
			for (int j = 1; j<=this.colLength; j++){
				if (this.board[i][j] == piece){
					Position pos = new PositionImpl(i,j);
					
					return pos;
				}
			}
		}
		return null;
	}

	@Override
	public boolean isReachEnd(Pieces piece) {
		// TODO Auto-generated method stub
		if (this.getPos(piece).getStringPos().equals(this.endPos.getStringPos())){
			return true;
		}
		return false;
	}
}
