/*
Given a string, compute recursively a new string where all the adjacent chars are now 
separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/
import java.util.*;
public class allStar{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(allStar(console.next()));
	}
	public static String allStar(String str) {
	 	if (str.length() <2 )return str;
	    return str.charAt(0)+"*"+allStar(str.substring(1));
	}
}