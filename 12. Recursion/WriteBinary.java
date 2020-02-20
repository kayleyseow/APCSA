/*
Write a recursive program called WriteBinary that takes an integer as a parameter
and writes its binary representation to the console. For example, WriteBinary(44)
should print 101100.  Your program should accommodate a negative integer as input.
*/
import java.util.*;
public class WriteBinary{
	public static void main(String[] args) {
		Scanner console  = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = console.nextInt();
		decitobin(integer);
		System.out.println();
	}
	public static void decitobin(int n){
		if (n == 0) {
			System.out.print(0);
		}
		else{
			if (n<0) {
				System.out.print("-");
			}
			decimaltobinary(Math.abs(n));
		}
	}
	public static void decimaltobinary(int n){
		if (n>0) {
			decimaltobinary(n/2);
			System.out.print(n%2);
		}
	}
}
