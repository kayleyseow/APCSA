import java.util.*;
public class PascalFibonacci {  
  public static void main(String[] args) {      
    Scanner console = new Scanner(System.in);
    int rowindex = 0;  
    int columnindex = 0;
    do { //check if the column or row index is bogus
      System.out.print("Input row index: "); 
      rowindex = console.nextInt();
      System.out.print("Input column index: ");      
      columnindex = console.nextInt();  
    }  while (!((rowindex>=0) && (rowindex<=91))||!((columnindex>=0) && (columnindex<=rowindex)));//|| (columnindex+rowindex+1>68) );  //software doensn't work for anything larger than 67
    long fibonacci = 0;// initialize a long
    int fibonacciindex = rowindex+columnindex+1;// number for calculation   
    int maxsize = 93; 
    long[][] arrPascal = new long[maxsize][maxsize];// make a new array
    arrPascal = fillPascalsTriangle(arrPascal);
    System.out.println("Fibonacci("+ fibonacciindex + ")     = " + calculatefibonacci(fibonacciindex,arrPascal));
    printRow(arrPascal, fibonacciindex-1);
  } 
  public static long[][] fillPascalsTriangle(long[][] array){
    int maxrows = array.length; // prints number of rows
    int maxcols = array[0].length; // prints number of columns
    array[0][0] = 1;//hardcode
    array[1][0] = 1;//hardcode
    array[1][1] = 1;//hardcode
    for (int rows = 2;rows<maxrows ;rows++ ) {
      array[rows][0] = 1;
      array[rows][rows] = 1;
      for (int cols = 0;cols<=rows-1 ;cols++ ) {
         array[rows][cols+1] = array[rows-1][cols]+array[rows-1][cols+1];
      } 
    }
    return array;
  }
  public static void printRow(long[][] array, int row) { //method prints the last row of numbers
    System.out.print("[");
    if (row==0) {
      System.out.print(array[0][0]);
    } 
    else{

      for (int i = 0; i <= row; i++) {

        if (i == row) {
          System.out.print(array[row][i]);//fencepost
        }
        else{
          System.out.print(array[row][i] + ", ");
        } 
      }       
    }  
    System.out.print("]"); 
  }  
  public static long calculatefibonacci(int index, long[][] array){//calculates the fibonacci sequence
    long sum = 0;
    int column = 0;
    if (index==1) {
      printarrayindex(0,0,array);
      sum=1;
    }
    else{
      for (int row = index-1;row>0 ;row-- ) {
        if (row < column) {
          break;
        }
        if (array[row][column]<0) {
          array[row][column]=0;
        }
        sum += array[row][column];
        printarrayindex(row, column, array);
        column ++;
      }
    }
    System.out.println("-----------------------");
    if (sum<0) {
      sum=0;  //if the sum is larger than what a long can hold, it means that it is negative
    }//if the number is negative, then has to be changed to a zero
    return sum;
  } 
  public static void printarrayindex(int row, int column, long[][] array){
    if (row==0&&column==0) {
      System.out.println("arrPascal[0][0]   = 1");
    }
    else{
      System.out.print("arrPascal[" + row + "][" + column + "]");
      if (column<10&&row<10) {
        System.out.print("   ");
      }
      else if ((column<10&&row>=10)||(column>=10&&row<10)) {
        System.out.print("  ");
      }
      else{
        System.out.print(" ");      
      }
      System.out.println("= " + array[row][column]);
    }
  }
}
