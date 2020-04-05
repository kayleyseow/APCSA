/*
Write a method called swapDigitPairs that accepts an integer n as a parameter and
returns a new integer whose value is similar to n’s but with each pair of digits
swapped in order. For example, the call of swapDigitPairs(482596) would return 845269.
Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the
number contains an odd number of digits, leave the leftmost digit in its original
place. For example, the call of swapDigitPairs(1234567) would return 1325476. You
should solve this problem without using a String.  You can assume the user will
always provide a positive integer that does not exceed the capacity of int.
*/

import java.util.*;
public class swapDigitPairs{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int number= console.nextInt();
		System.out.println("swapped result = " + swap(number));
   	}
   	public static int swap(int x) {
	    int power = 1;
	    int swapNum = 0; 
	    while (x >= 10) {
	        int dig1 = x % 10;
	        x /= 10;
	        int dig2 = x % 10;
	        x /= 10;
	        swapNum += dig1 * (int) Math.pow(10, power) + dig2 * (int) Math.pow(10, power - 1);
	        power += 2;
	    }   
	    swapNum += x * Math.pow(10, power -1);
	    return swapNum;
	}	
}
