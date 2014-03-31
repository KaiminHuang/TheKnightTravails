package Implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import components.PieceType;
import components.Pieces;
import components.Position;

/**
 * The implementation of Knight
 * 
 * @author kaimin huang
 */

public class KnightImpl implements Pieces {

	// define the type of this piece
	private PieceType pieceType = PieceType.Knight;
	// indicates the current position of the knight
	private Position pos;

	private List<Position> path = new ArrayList<Position>();

	public KnightImpl() {
	}

	@Override
	public void setPos(Position pos) {
		// TODO Auto-generated method stub
		this.pos = pos;
		addToPath(pos);
	}

	@Override
	public Position getPos() {
		// TODO Auto-generated method stub
		return this.pos;
	}

	@Override
	public List<Position> getValidMove(Position pos) {
		// TODO Auto-generated method stub
		List<Position> possibleMoves = new CopyOnWriteArrayList<Position>();
		// add all possible next position to the possibleMove array
		// PositionImpl will only
		possibleMoves.add(new PositionImpl(pos.getRowPos() + 1,
				pos.getColumnPos() + 2));
		possibleMoves.add(new PositionImpl(pos.getRowPos() + 1,
				pos.getColumnPos() - 2));
		possibleMoves.add(new PositionImpl(pos.getRowPos() + 2,
				pos.getColumnPos() + 1));
		possibleMoves.add(new PositionImpl(pos.getRowPos() + 2,
				pos.getColumnPos() - 1));
		possibleMoves.add(new PositionImpl(pos.getRowPos() - 1,
				pos.getColumnPos() + 2));
		possibleMoves.add(new PositionImpl(pos.getRowPos() - 1,
				pos.getColumnPos() - 2));
		possibleMoves.add(new PositionImpl(pos.getRowPos() - 2,
				pos.getColumnPos() + 1));
		possibleMoves.add(new PositionImpl(pos.getRowPos() - 2,
				pos.getColumnPos() - 1));

		// remove Invalid position in possible moves
		Iterator<Position> it = possibleMoves.iterator();
		while(it.hasNext()){
			Position pm = it.next();
			if (pm.getColumnPos() == -1 || pm.getRowPos() == -1) {
				possibleMoves.remove(pm);
			}
			
		}
		return possibleMoves;
	}

	public void addToPath(Position pos) {
		// TODO Auto-generated method stub
		this.path.add(pos);
	}

	public List<Position> getPath() {
		// TODO Auto-generated method stub
		return this.path;
	}



	public Position caculateNextMove() {
		Position nextPos = this.pos;

		return nextPos;

	}
}
