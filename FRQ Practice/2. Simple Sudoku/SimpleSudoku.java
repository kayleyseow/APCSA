import java.util.*;
public class SimpleSudoku {
	Scanner console = new Scanner(System.in);
    /* 9x9 board */
    private int[]   simpleSudokuLine  = new int[10];
    private int[][] simpleSudokuBoard = new int[9][9];

    /** Takes in one line and inserts the numbers into simpleSudokuLine.
    The 10th element is the row number. */
    private void readLine() {
        /* your method here */
        String line = console.next();
        int linenumber = console.nextInt();
        for (int i=0;i<9;i++){
        	simpleSudokuLine[i] = Integer.parseInt(line.substring(i,i+1));
        }
        simpleSudokuLine[10] = linenumber;
    }

    /* Fills in simpleSudokuBoard using successive calls to readLine(),
    placing each line in its ordered position */
    public void fillBoard() {
        /* your method here */
        int linenum = simpleSudokuLine[10]-1;
        for (int i = 0;i<9;i++){
        	int number = simpleSudokuLine[i];
        	simpleSudokuBoard[linenum][i] = number;
        }
    }

    /** Return 1 if the board is a valid Simple Sudoku solution, i.e. the
    numbers 1 through 9 are found in each row and each column of the board.
    Return 0 if not. */
    public boolean validBoard() {
        /* your method here */
        boolean[] rowtrue1= new boolean[9];
        boolean[] columntrue1= new boolean[9];
        for (int i=0;i<9;i++){
        	rowtrue1[i] = false;
        	columntrue1[i] = false;
        }
        for (int row = 0;row<9 ;row++ ) {
        	boolean columnhas1= false;
        	boolean columnhas2= false;
        	boolean columnhas3= false;
        	boolean columnhas4= false;
        	boolean columnhas5= false;
        	boolean columnhas6= false;
        	boolean columnhas7= false;
        	boolean columnhas8= false;
        	boolean columnhas9= false;
        	for (int column = 0;column<9 ;column++ ) {
        		if (simpleSudokuBoard[row][column]==1) columnhas1 = true;
        		if (simpleSudokuBoard[row][column]==2) columnhas2 = true;
        		if (simpleSudokuBoard[row][column]==3) columnhas3 = true;
        		if (simpleSudokuBoard[row][column]==4) columnhas4 = true;
        		if (simpleSudokuBoard[row][column]==5) columnhas5 = true;
        		if (simpleSudokuBoard[row][column]==6) columnhas6 = true;
        		if (simpleSudokuBoard[row][column]==7) columnhas7 = true;
        		if (simpleSudokuBoard[row][column]==8) columnhas8 = true;
        		if (simpleSudokuBoard[row][column]==9) columnhas9 = true;
        	}
        	if (columnhas1&&columnhas2&&columnhas3&&columnhas4&&columnhas5&&columnhas6&&columnhas7&&columnhas8&&columnhas9) rowtrue1[row] = true;
        }
        for (int column = 0;column<9 ;column++ ) {
        	boolean columnhas1= false;
        	boolean columnhas2= false;
        	boolean columnhas3= false;
        	boolean columnhas4= false;
        	boolean columnhas5= false;
        	boolean columnhas6= false;
        	boolean columnhas7= false;
        	boolean columnhas8= false;
        	boolean columnhas9= false;
        	for (int row = 0;row<9 ;row++ ) {
        		if (simpleSudokuBoard[row][column]==1) columnhas1 = true;
        		if (simpleSudokuBoard[row][column]==2) columnhas2 = true;
        		if (simpleSudokuBoard[row][column]==3) columnhas3 = true;
        		if (simpleSudokuBoard[row][column]==4) columnhas4 = true;
        		if (simpleSudokuBoard[row][column]==5) columnhas5 = true;
        		if (simpleSudokuBoard[row][column]==6) columnhas6 = true;
        		if (simpleSudokuBoard[row][column]==7) columnhas7 = true;
        		if (simpleSudokuBoard[row][column]==8) columnhas8 = true;
        		if (simpleSudokuBoard[row][column]==9) columnhas9 = true;
        	}
        	if (columnhas1&&columnhas2&&columnhas3&&columnhas4&&columnhas5&&columnhas6&&columnhas7&&columnhas8&&columnhas9) columntrue1[column] = true;
        }
        if (rowtrue1[0]&&rowtrue1[1]&&rowtrue1[2]&&rowtrue1[3]&&rowtrue1[4]&&rowtrue1[5]&&rowtrue1[6]&&rowtrue1[7]&&rowtrue1[8]&&columntrue1[1]&&columntrue1[2]&&columntrue1[3]&&columntrue1[4]&&columntrue1[5]&&columntrue1[6]&&columntrue1[7]&&columntrue1[8]&&columntrue1[9]) return true;
        return false;
    }
}