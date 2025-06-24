package problem_2;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
		int currentRow = a.getRow();
        int currentCol = a.getColumnIndex();

        int targetRow = b.getRow();
        int targetCol = b.getColumnIndex();
        
        int rowDiff = Math.abs(currentRow - targetRow);
        int colDiff = Math.abs(currentCol - targetCol);

        return rowDiff == colDiff;
    }
}
