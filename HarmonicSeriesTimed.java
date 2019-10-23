//Harmonic Series with a timer to see how long it will take to caltulate the numbers
//the limit number is around 22.05
import java.util.*; 
public class HarmonicSeriesTimed { 
    public static void main(String args[]) { 
    	Scanner console = new Scanner(System.in);
		double terms= console.nextDouble();
		double sum = 0.0;
		double deno = 0.0;
		final long startTime = System.currentTimeMillis();
		while (sum <= terms){		
			//fractionSum(sumLimit); 
			deno++;
			sum = sum + 1/(deno);
		} 
		final long endTime = System.currentTimeMillis();
        System.out.printf("Actual sum = %.5f\n", sum); 
        System.out.println("Number of terms required: " +(int)(deno) );  
        System.out.println("Total execution time: " + (endTime - startTime) );

    } 
    /*static double sum(int x) { 
      double i = 0.0; 
      double y = 0.0; 
      int z = 1;
      while ()
      for (i = 1; i <= x;i++ ) {
      	y = y + 1/i;
      	z = z++;
      }
      y = Math.round (y *100000)/100000.0;
      return y; 
    } */
     
    
} 

/* public static void main(String[] Args) {
      Scanner input=new Scanner(System.in);
      double rows= input.nextDouble();
        for (double n = 0; n < rows; n++) {
            double result = 1;
            for (double r = 0; r <= n; r++) {
                if (r > 0) {
                    result = ((n - r + 1) / r) * result;
                    Math.ceil(result);
                     System.out.printf("%4d", Math.round(result));
                } else {
                   for (int spaces = 2; spaces < -2*n + (2*rows); spaces++) {
                 // for(double i= 2*rows; i>=0; i=i-2){
                        System.out.printf("%1s","");
                    }
                    System.out.printf("%1d",1);
                }
            }
            System.out.println();
        }
    }
}
*/
