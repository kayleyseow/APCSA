/*
Write a recursive program called FindGCD that calculates the greatest
common divisor, or largest positive integer that goes evenly into two
different integers. Each of the starting integers can be positive, negative,
or 0. Your program should always return a positive GCD, even if one or both
of the starting integers are negative.

Suggestion: use Euclid's algorithm:

GCD(x, y) = GCD(x % y, y), and
GCD(x, 0) = absolute value of x.

Your program should allow starting integers to be input in either order.
Note that recursive application of Euclid's algorithm makes progress only if
the first number is >= than the second number. To guarantee this, reverse
the order of the arguments:

GCD (x,y) = GCD(y, x % y)

For example, using GCD(x, y) = GCD(x % y, y),
GCD(132, 20) = GCD(12,20) = GCD(12, 20) ==> infinite recursion.

Using GCD (x,y) = GCD(y, x % y),
GCD(132, 20) = GCD(20, 12) = GCD(12, 8) = GCD(8, 4) = GCD(4, 4) = GCD(4,0)
*/
import java.util.*;
public class FindGCD{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer  = console.nextInt();
		System.out.print("Enter an integer: GCD = ");
		int integer2  = console.nextInt();
		gcd(integer, integer2);
		System.out.print("\n");
	}
	public static void gcd(int x, int y) {
	    if (y==0) {
	    	System.out.print(x);
	    	return ;
	    }
	    else{
	    	//x=y;
	    	//y=x%y;
	    	gcd(y, x%y);
	    }
	}
}
