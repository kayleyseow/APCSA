/*
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that 
mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes 
the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/
import java.util.*;
public class sumDigits{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number : ");
		System.out.println(sumDigits(console.nextInt()));
	}
	public static int sumDigits(int n) {
	    if (n==0) return 0;
	     return n%10 + sumDigits (n/10);
	}
}