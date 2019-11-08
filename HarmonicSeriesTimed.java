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
} 
