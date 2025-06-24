package problem_2;

public abstract class Piece {
	Position a;
	
    public Piece(Position position) {
        a = position;
    }
    
    public void setPosition(Position newPosition) {
        this.a = newPosition;
    }
    
	public abstract boolean isLegalMove(Position b);
	
    public String toString() {
        return getClass().getSimpleName() + " at " + a.getRow() + a.getColumn();
    }
}
