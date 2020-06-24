/*
You're at one hour before the AP Calculus test, and your calculator has stopped
working. Luckily, you have a programmable Arduino next to you. All you have time
for is basic addition, subtraction, multiplication and division. You try quickly
to write the code, but in your haste spill coffee all over your keyboard. Now,
the * and / keys are not working. Furthermore, the + and - keys behave like they
are on caffeine highs and produce ++ and -- only, not + and -.

Implement iterative methods to rescue you from your coffee spill.
Extra credit oportunity: implement recursive methods.

Take in two positive integers from the user, space separated. While both integers
will be >= 1, the first is not necessarily larger than the second.

Input/output example:

Enter two integers, space separated: 
4 5
9
-1
20
0
*/
import java.util.*;

public class CalculatorAP
{
	/* Input: 2 integers
	   Output: Sum of those 2 integers*/
	public int add(int a, int b) {
		int ans = 0;
		for (int i = 0; i < a; i++) {
			ans++;
		}
		for (int i = 0; i < b; i++) {
			ans++;
		}
		return ans;
	}

	/* Input: 2 integers
	   Output: Difference of those 2 integers*/
	public int subtract(int a, int b) {
		int ans = a;
		for (int i = 0; i < b; i++) {
			ans--;
		}
		return ans;
	}

	/* Input: 2 integers
	   Output: Those 2 integers multiplied together*/
	public int multiply(int a, int b) {
		int ans = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				ans++;
			}
		}
		return ans;
	}


	/* Input: 2 integers
	   Output: int a / int b
	   Output is truncated
	   */
	public int divide(int a, int b) {
		int ans = 0;
		if (a < b) return 0;
		while (a >= 0) {
			for (int i = 0; i < b; i++) {
				a--;	
			}
			if (a >= 0) {
				ans++;
			} else {
				return ans;
			}
		}
		return ans;
	}

	/* Main program. Output should be:
		9
		1
		20
		1	
	*/
	public static void main(String args[]) {
        CalculatorAP calc = new CalculatorAP();
        System.out.println("Enter two integers, space separated: ");
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.multiply(num1, num2));
        System.out.println(calc.divide(num1, num2));
    }

}
