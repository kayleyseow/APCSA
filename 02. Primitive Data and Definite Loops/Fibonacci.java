import java.util.*;

public class Fibonacci {
	public static void main (String[] args) {
		long number1 = 0;
		long number2 = 1;
		long number3;
		System.out.print("Enter number of terms: ");
		Scanner console = new Scanner(System.in);
		int numberOfTerms = console.nextInt();
		System.out.println(number1);
		System.out.println(number2);
		for (int i=3; i <= numberOfTerms; i++){
			number3 = number1+number2;
			System.out.println(number3);
			number1=number2;
			number2=number3;
		}
	}
}
