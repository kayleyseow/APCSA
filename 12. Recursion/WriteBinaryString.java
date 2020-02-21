/*
Write a second recursive program called WriteBinaryString that takes an integer as a parameter
and returns the binary expression of the integer in String format For example, WriteBinaryString(44)
should return 101100. You should print out the binary expression to the console. Your program should
accommodate a negative integer as input.
Note: Integer.toString(int a) is a built-in method in Java which returns a String representing the integer
parameter.
*/
import java.util.*;
public class WriteBinaryString{
	public static void main(String[] args) {
		Scanner console  = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = console.nextInt();
		System.out.println("Binary expression: " + binary(integer));
	}
	public static String binary(int n) {
		if (n == 0) return "0";
		if (n == 1) return "1";
		if (n<0){
			return "-" + binary(-1 * n);
		}
		else{
			return binary(n / 2) + (n % 2);
		}
		//return (n < 0 ? "-" + binary(-1 * n) : binary(n / 2) + (n % 2));
	}
}
