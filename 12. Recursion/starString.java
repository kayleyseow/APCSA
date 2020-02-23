/*
Write a recursive method called starString that accepts an integer as a parameter and prints to the console a string 
of stars (asterisks) that is 2^n (i.e., 2 to the nth power) long. For example, 
• starString(0) should print * (because 2^0 == 1) 
• starString(1) should print ** (because 2^1 == 2) 
• starString(2) should print **** (because 2^2 == 4) 
• starString(3) should print ******** (because 2^3 == 8) 
• starString(4) should print **************** (because 2^4 == 16) 
The method should throw an IllegalArgumentException if passed a value less than 0. 
*/
import java.util.*;
public class starString{
	public static void main(String[] args) throws IllegalArgumentException{
		Scanner console = new Scanner(System.in);
		int nthpower = console.nextInt();
		System.out.println(printstarstring(nthpower));
	}
	public static String printstarstring(int num){
		if (num==0) {
			String re = "*";
			return re;
		}
		else{
			String t = printstarstring(num-1);
			return t+t;
		}
	}
}
