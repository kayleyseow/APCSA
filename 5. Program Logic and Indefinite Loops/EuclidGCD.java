/*
Find the greatest common devisor (GCD) of two integers using
Euclid's algorithm GCD (a,b) = GCD (b, a % b).
Note: GCD (a,0) = |a|.
*/
import java.util.*;
public class EuclidGCD {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive integer a: ");
		int posinta= console.nextInt();
		System.out.println("Enter positive integer b: ");
		int posintb= console.nextInt();
		System.out.println("Greatest common divisor (GCD) = "+ gcd(posinta,posintb));
	}
	public static int gcd(int a, int b){
		while (b == 0){
			return Math.abs(a);
		}
		System.out.println ("prints"+ a + " " + b);
		return gcd (b, a%b);
	}
}
