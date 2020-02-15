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