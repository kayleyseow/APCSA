/*Write a program that displays Pascal's Triangle.
Format the output into fields of width 4, right aligned.
You may use printf for the field width.
For example, for a user input of 14 rows, here is the required console output:

                          1
                        1   1
                      1   2   1
                    1   3   3   1
                  1   4   6   4   1
                1   5  10  10   5   1
              1   6  15  20  15   6   1
            1   7  21  35  35  21   7   1
          1   8  28  56  70  56  28   8   1
        1   9  36  84 126 126  84  36   9   1
      1  10  45 120 210 252 210 120  45  10   1
    1  11  55 165 330 462 462 330 165  55  11   1
  1  12  66 220 495 792 924 792 495 220  66  12   1
1  13  78 286 7151287171617161287 715 286  78  13   1

Your program should take as input from the user the number of rows desired.  For simplicity using HyperGrade, no user prompt should be provided.  Your program should run for any number of rows, with the understanding that given the field width of 4 the values in the triangle will start to run into one another starting at row 14.  You can observe this in the example above, where the four central elements in row 14 are each 4 digits long:  1287, 1716, 1716, 1287.  At row 17, the largest element becomes 5 digits long - do not be concerned with triangles beyond 16 rows.  Recall that any element in Pascal's triangle is given by nCr = n! / (r!(n - r)!), where n is the row index starting at 0 (i.e. the 14th row corresponds to n = 13) and r is the position index within a given row, also starting at index 0.  For example the above mentioned 6th element in the 14th row, 1287, is given by nCr = 13C5  = 1287.
Further simplification is realized by taking the ratio of any element nCr to the preceding element nCr-1 in the same row, which can be shown to reduce to (n - r + 1)/r.  Thus, the first element in any row is 1, corresponding to r = 0, and every other element in that row is obtained by multiplying the preceding element by the ratio (n - r + 1)/r.  In other words, any row in Pascal’s triangle can be generated without knowledge of the row above (you do not need to calculate large factorials, nor do you need to use arrays to solve this problem). 
*/
import java.util.*; 
public class PascalsTriangleNoComments { 
    public static void main(String args[]) { 
      Scanner console = new Scanner(System.in);
      int rows= console.nextInt();
      for (int j=1;j<= rows ;j++ ) {
          for (int i = 0; i < rows-j ;i++) {
            System.out.print("  ");
          } 
          System.out.printf("%1d", ptequation(j, 1));
          for (int i = 2;i <= j ;i++ ) {
            System.out.printf("%4d", ptequation(j, i));
          }
          System.out.println();
      }
}
    public static long factorial(long x){
      long fact= 1 ;  
      long number=x;  
      for(long i=1;i<=number;i++){    
        fact=fact*i;
      }
      return fact;
    } 
   public static long ptequation(int rowindex, int positionindex){
      int n = rowindex-1;
      int r = positionindex-1;
      long top = factorial(n);
      long bottom  = ((factorial(r))*(factorial(n-r)));
      long result = top/bottom;
      return result;
    }
 }                     
