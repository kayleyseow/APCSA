/*
Write a recursive program called WriteNums that takes an integer n
from the console and prints to the console the first n integers,
starting with 1 in sequential order, separated by commas.
For example, an input of 7 should produce 1, 2, 3, 4, 5, 6, 7

In this example, note that there is no trailing space after the 7.
Your method should throw an IllegalArgumentException if passed a
value less than 1.
*/
import java.util.*;
public class WriteNums{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer  = console.nextInt();
		writeNums(integer);
		System.out.print("\n");
	}
	public static void writeNums(int n) {
	    if(n < 1)
	        throw new IllegalArgumentException();
	        
	    if(n == 1) {
	        System.out.print(1);
	        return;
	    }
	    
	    writeNums(n - 1);
	    System.out.print(", " + n);
	}
}
