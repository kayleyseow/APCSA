import java.util.Scanner;

// import jdk.nashorn.internal.ir.ForNode;

/*
With time on your hands, you have been working on a book of Simple Sudoku
puzzles. You would like to check your solutions but, unfortunately, your
puppy has chewed up the answer section in protest of not enough walks.
Luckily, however, you have access to a scanner to read in your number
characters, one line at a time. Unluckily, though, you are not the most
organized person and cannot be depended on to scan the lines in order.
You recognize this as a JAVA-TO-THE-RESCUE opportunity.

Develop methods to read in a solution, place the numbers on a Simple Sudoku
board, and determine if the solution is valid.

Simple Sudoku differs from regular Sudoku in that the numbers 1-9 need only be
present in each row and column, but not necessarily in any 3x3 square cell.

Here is an example of a valid Simple Sudoku solution:

 "9 8 7 6 5 4 3 2 1
  8 7 6 5 4 3 2 1 9
  7 6 5 4 3 2 1 9 8
  6 5 4 3 2 1 9 8 7
  5 4 3 2 1 9 8 7 6
  4 3 2 1 9 8 7 6 5
  3 2 1 9 8 7 6 5 4
  2 1 9 8 7 6 5 4 3
  1 9 8 7 6 5 4 3 2"

The input consists of nine lines, each containing a string representing
the numbers in that row, followed by the row number. The output consists
of one int: 1 (if valid) or 0 (if invalid).

Here is an example of program input/output corresponding to the above valid
solution:

987654321 1
765432198 3
543219876 5
321987654 7
198765432 9
876543219 2
654321987 4
432198765 6
219876543 8
1

Note that in Simple Sudoku row order does not affect validity, but
part of your task is to put the rows in correct order.

You are not being asked to write a working program; simply develop the
methods. You can assume in a later method that all previous methods work
as intended.

Skeleton code:
*/

public class SimpleSudokuSA {

    /* 9x9 board */
    private int[]   simpleSudokuLine  = new int[10];
    private int[][] simpleSudokuBoard = new int[9][9];
    private Scanner console = new Scanner(System.in);

    /** Takes in one line and inserts the numbers into simpleSudokuLine.
    The 10th element is the row number. */
    private void readLine() {
  
      String s = console.nextLine();
      int linenum = Integer.parseInt(s.charAt(10)+"");
      for (int i = 0; i < 9; i++) {
        simpleSudokuLine[i] = Integer.parseInt((s.charAt(i))+""); 
      }
      simpleSudokuLine[9] = linenum;
    }

    /* Fills in simpleSudokuBoard using successive calls to readLine(),
    placing each line in its ordered position */
    public void fillBoard() {
      for (int i = 0; i < 9; i++) {
        readLine();

        int[] temp = new int[9];
        for (int j = 0; j < 9; j++) {
          temp[j] = simpleSudokuLine[j];
        }
        simpleSudokuBoard[simpleSudokuLine[9]-1] = temp.clone();
      }
    }

    /** Returns whether or not the board is a valid Simple Sudoku solution,
    i.e. the numbers 1 through 9 are found in each row and each column of
    the board. */
    public boolean validBoard() {
      for (int i = 0; i < 9; i++) {
        int[] numcheck = new int[10];
        for (int j = 0; j < 9; j++) {
          numcheck[simpleSudokuBoard[i][j]-1] += 1;
        }
        for (int j = 0; j < 9; j++) {
          if(numcheck[j]!= 1){
            System.out.println(i + " " + j);
            return false;
          }
        }
      }

      for (int i = 0; i < 9; i++) {
        int[] numcheck = new int[10];
        for (int j = 0; j < 9; j++) {
          numcheck[simpleSudokuBoard[j][i]-1] += 1;
        }
        for (int j = 0; j < 9; j++) {
          if(numcheck[j]!= 1){
            return false;
          }
        }
      }
      return true;
    }
    public static void main(String[] args){
      System.out.println("Enter nine rows of Simple Sudoku input: ");
      SimpleSudokuSA sudoku = new SimpleSudokuSA();
      sudoku.fillBoard();
      System.out.println(sudoku.validBoard());
    } 
}