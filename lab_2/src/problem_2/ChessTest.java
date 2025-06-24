package problem_2;

public class ChessTest {
    public static void main(String[] args) {
        Piece pawn = new Pawn(new Position(2, 'e'));
        Piece rook = new Rook(new Position(1, 'a'));
        Piece bishop = new Bishop(new Position(1, 'c'));
        Piece knight = new Knight(new Position(1, 'b'));
        Piece queen = new Queen(new Position(1, 'd'));
        Piece king = new King(new Position(1, 'e'));

        System.out.println(pawn + " moving to e3: " + pawn.isLegalMove(new Position(3, 'e')));
        System.out.println(rook + " moving to a5: " + rook.isLegalMove(new Position(5, 'a')));
        System.out.println(bishop + " moving to 4f: " + bishop.isLegalMove(new Position(4, 'f')));
        System.out.println(knight + " moving to c3: " + knight.isLegalMove(new Position(3, 'c')));
        System.out.println(queen + " moving to h5: " + queen.isLegalMove(new Position(5, 'h')));
        System.out.println(king + " moving to e2: " + king.isLegalMove(new Position(2, 'e')));
    }
}
