public class PascalFibonacci2 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Input row index: ");
    int r = console.nextInt();
    System.out.print("Input column index: ");
    int c = console.nextInt();
    int r2 = r;
    int c2 = c;
    int last_row = r2 + c2;
    long[][] pascal = new long[92][92];
    for (int i = 0; i < 92; i++) {
      	pascal[i][0] = 1;
      	pascal[i][i] = 1;
    }
    for (int i = 2; i < 92; i++) {
      for (int j = 1; j < i; j++) {
      	if ( pascal[i-1][j-1] > 0 && pascal[i-1][j] > 0) {
        	pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }
        else {
        	pascal[i][j] = 0;
        }
        if (pascal[i][j] < 0) {
        	pascal[i][j]=0;
        }

      }
    }
    long sum = 0;

    r2 += c2;
    c2 = 0;
    int fib = r2+1;
    while( r2 >= c2 ) {
      String p = "arrPascal["+r2+"]["+c2+"]";
      System.out.printf("%-18s= ",p);
      System.out.println(pascal[r2][c2]);
      if ( pascal[r2][c2] > 0)
      	sum += pascal[r2][c2];
      r2--;
      c2++;
    }

  }
}
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9 1
*/
