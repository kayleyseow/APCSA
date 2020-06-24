import java.util.*;
public class Calculator{
	/* Input: 2 integers
	   Output: Sum of those 2 integers*/
	public int add(int a, int b){
		int sum = 0;
		for (int i = 0;i<a;i++)sum++;
		for (int i = 0;i<b;i++)sum++;
		return sum;
	}
	/* Input: 2 integers
	   Output: Difference of those 2 integers*/
	public int subtract(int a, int b){
		int difference = a;
		for (int i = b;i>0;i--) {
			difference--;
		}
		return difference;
	}
	/* Input: 2 integers
	   Output: Those 2 integers multiplied together*/
	public int multiply(int a, int b){
		int product = 0;
		for (int i = 0;i<a;i++) for (int j = 0;j<b;j++) product++;
		return product;	
	}
	/* Input: 2 integers
	   Output: int a / int b
	   Output is truncated
	   */
	public int divide(int a, int b){
		int quotient = 0; 
		while (a >= b) { 
		    a -= b; 
		    quotient++; 
		} 
		return quotient;
	}
	/* Main program. Output should be:
		9
		1
		20
		1	
	*/
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter two integers, space separated: ");
		int a = console.nextInt();
		int b = console.nextInt();
        Calculator calc = new Calculator();
        System.out.println(calc.add(a, b));
        System.out.println(calc.subtract(a, b));
        System.out.println(calc.multiply(a, b));
        System.out.println(calc.divide(a, b));
    }
}