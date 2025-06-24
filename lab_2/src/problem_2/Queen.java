package problem_2;

public class Queen extends Piece {

    public Queen(Position position) {
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

        return (currentRow == targetRow) || 
               (currentCol == targetCol) || 
               (rowDiff == colDiff);
    }
}
