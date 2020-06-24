import java.util.*;
public class SimpleSudokuClientQY{
	public static void main(String[] args){
		System.out.println("Enter nine rows of Simple Sudoku input: ");
		SimpleSudokuQY sudoku = new SimpleSudokuQY();
		sudoku.fillBoard();
		System.out.println(sudoku.validBoard());
	}
}