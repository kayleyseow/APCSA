import java.util.*;
import java.io.*;
public class SimpleSudokuQY extends SimpleSudokuClientQY{

    /* 9x9 board */
    private int[] simpleSudokuLine = new int[10];
    private int[][] simpleSudokuBoard = new int[9][9];
    Scanner console = new Scanner(System.in);

    /** Takes in one line and inserts the numbers into simpleSudokuLine.
    The 10th element is the row number. */
    private void readLine() {
        /* your method here */
        String line = console.next();
        for(int i = 0; i < 9; i++){
            simpleSudokuLine[i] = Character.getNumericValue(line.charAt(i));
        }
        simpleSudokuLine[9] = console.nextInt();
    }

    /* Fills in simpleSudokuBoard using successive calls to readLine(),
    placing each line in its ordered position */
    public void fillBoard() {
        /* your method here */
        for(int i = 0; i < 9; i++){
            readLine();
            for(int j = 0; j < 9; j++){
                simpleSudokuBoard[simpleSudokuLine[9] - 1][j] = simpleSudokuLine[j];
            }
        }
    }

    /** Return 1 if the board is a valid Simple Sudoku solution, i.e. the
    numbers 1 through 9 are found in each row and each column of the board.
    Return 0 if not. */
    public boolean validBoard() {
        /* your method here */
        int[] sudoku = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < 9; i++){
            int[] row = new int[9];
            int[] column = new int[9];
            for(int j = 0; j < 9; j++){
                row[j] = simpleSudokuBoard[i][j];
                column[j] = simpleSudokuBoard[j][i];
            }
            Arrays.sort(row);
            Arrays.sort(column);
            if(!Arrays.equals(row, sudoku)){
                return false;
            }else if(!Arrays.equals(column, sudoku)){
                return false;
            }
        }
        return true;
    }
    
}