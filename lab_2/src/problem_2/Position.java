package problem_2;

public class Position {
    private int row; 
    private char column; 

    public Position(int row, char column) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new IllegalArgumentException("Invalid position: " + column + row);
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }
    
    public char getColumn() {
    	return column;
    }
    public int getColumnIndex() {
        return column - 'a' + 1;
    }

}
