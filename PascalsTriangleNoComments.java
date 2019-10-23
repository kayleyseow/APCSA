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