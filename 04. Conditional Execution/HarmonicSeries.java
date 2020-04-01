/*
Write a Java program named HarmonicSeries that sums the terms of the Harmonic series:  1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6  .  .  .

Your program should accept from the console a double number representing a limit, determine the minimum number of terms which when summed will exceed that limit, and report the actual sum of those terms.
For example, a user input to the console of 1.5 should result in this console output:
Actual sum = 1.83333
Number of terms required: 3

In other words, a minimum of 3 terms of the Harmonic series are required to exceed the sum of 1.5, and the sum of those 3 terms is 1.83333 (rounded).
You may use printf to round your sum to the nearest 5th decimal place.  Your sum must be rounded, not truncated.
Other test cases, not available to you, will also be tested.  Assume that the target sum will always be in the range 1 to 10.  (In fact, be careful not to test for sums much larger than 10 because your program might take many precious seconds to execute.)
Be sure to match the format of the example EXACTLY.  There are two lines of output with no blank lines and no trailing spaces.  If the number or terms exceeds 1,000, output with no commas, e.g. 1000.
*/
import java.util.*; 
public class HarmonicSeries { 
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
