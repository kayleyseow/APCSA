/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of 
sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/
import java.util.*;
public class strCopies{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = console.next();
		System.out.println("Enter SubString: ");
		String sub = console.next();
		System.out.println("Enter Copies: ");
		int n = console.nextInt();
		System.out.println(strCopies(string, sub, n));
	}
	public static boolean strCopies(String str, String sub, int n) {
		int lengthsub = sub.length();
		if (n==0 ) return true;
		if (str.length()<lengthsub ) return false;
		if (str.substring(0,lengthsub).equals(sub) )return strCopies(str.substring(1), sub, n-1 );
		return strCopies(str.substring(1), sub, n);
	}
}