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

	public KnightImpl() {
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


}
