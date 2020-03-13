/*
Given a string and a non-empty substring sub, compute recursively the number of times 
that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/
import java.util.*;
public class strCount{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = console.next();
		System.out.println("Enter SubString: ");
		String sub = console.next();
		System.out.println(strCount(string, sub));
	}
	public static int strCount(String str, String sub) {
		int lengthsub = sub.length();
		if (str.length()<lengthsub ) return 0;
		if (str.substring(0,lengthsub).equals(sub) ) return 1+ strCount(str.substring(lengthsub), sub );
		return strCount(str.substring(1), sub );
	}
}