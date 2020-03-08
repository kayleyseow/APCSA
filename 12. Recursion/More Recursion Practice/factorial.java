/*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute 
the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/
import java.util.*;
public class factorial{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number to be factorialized: ");
		int number = console.nextInt();
		System.out.println(number+"! = " +f(number));
	}
	public static int f(int num){
		if (num==1) {
			return 1;
		}
		else{
			return num*f(num-1);
		}
	}
}
