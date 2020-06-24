import java.util.*;
import java.lang.*;
import java.io.*;

public class CalculatorJG{
	/* Input: 2 integers
	   Output: Sum of those 2 integers*/
	public int add(int a, int b) {
		for (int i=0; i<b; i++) {
			a++;
		}
		return a;
	}

	/* Input: 2 integers
	   Output: Difference of those 2 integers*/
	public int subtract(int a, int b) {
		for (int i=0; i<b; i++) {
			a--;
		}
		return a;
	}

	/* Input: 2 integers
	   Output: Those 2 integers multiplied together*/
	public int multiply(int a, int b) {
		int c = a;
		for (int i=0; i<subtract(b,1); i++) {
			a=add(a,c);
		}
		return a;
	}


	/* Input: 2 integers
	   Output: int a / int b
	   Output is truncated
	   */
	public int divide(int a, int b) {
		int count = 0;
		while (a>=b) {
			a=subtract(a,b);
			count++;
		}
		return count;
	}

	/* Main program. Output should be:
		9
		1
		20
		1	
	*/
	public static void main(String args[]) {
        CalculatorJG calc = new CalculatorJG();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers, space separated: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.multiply(num1, num2));
        System.out.println(calc.divide(num1, num2));
    }
}
