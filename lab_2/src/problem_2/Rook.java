package problem_2;

public class Rook extends Piece{

	public Rook(Position position) {
		super(position);
	}

	@Override
	public boolean isLegalMove(Position b) {
		int currentRow = a.getRow();
        int currentCol = a.getColumnIndex();

        int targetRow = b.getRow();
        int targetCol = b.getColumnIndex();
        
        return (currentRow == targetRow || currentCol == targetCol);
	}

}
