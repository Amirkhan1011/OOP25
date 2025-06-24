package problem_2;

public class Knight extends Piece {

    public Knight(Position position) {
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

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
