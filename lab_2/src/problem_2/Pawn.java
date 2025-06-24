package problem_2;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }
    
    @Override
    public boolean isLegalMove(Position b) {
        int currentRow = a.getRow();
        int currentCol = a.getColumnIndex();

        int targetRow = b.getRow();
        int targetCol = b.getColumnIndex();


        return (targetCol == currentCol) && (targetRow == currentRow + 1 || targetRow == currentRow + 2);
    }
}
