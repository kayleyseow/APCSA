/*
Write a function that returns the factorial of a natural number, defined as
n! = n * (n-1) * (n-2) * . . . * 3 * 2 * 1.
	public static int factorial(int n){}
Using the above function if necessary, write a method that returns the superfactorial
of a natural number, defined as
n? = n! * (n-1)! * (n-2)! * . . . * 3! * 2! * 1
	public static int superfactorial(int n){}
Using the above function if necessary, write a method that returns the ultrafactorial
of a natural number, defined as
n$ = n? * (n-1)? * (n-2)? * . . . * 3?! * 2?! * 1
	public static int ultrafactorial(int n){}
In each case, report your result % the 10,000,001st prime.
*/
import java.util.Scanner;
public class UltraFactorial{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a natural number (non-negative integer): ");
		int number = console.nextInt();
		factorial(number);
	}
	public static void factorial(int x){
		long fa = 1;
		long superfactorial = 1;
		long ultrafactorial=1;
		for (int i = 1; i<x; i++){
			fa *= (i+1);
			fa%=179424691;
			superfactorial*=fa;
			superfactorial%=179424691;
			ultrafactorial*= superfactorial;
			ultrafactorial%=179424691;
		}
		System.out.println("factorial       " +fa);
		System.out.println("superfactorial: "+superfactorial);
		System.out.println("ultrafactorial: "+ ultrafactorial);
	}
}
