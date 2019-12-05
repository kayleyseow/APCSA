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

  }
}
