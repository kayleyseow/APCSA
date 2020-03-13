/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" 
or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
*/
import java.util.*;
public class nestParen{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(nestParen(console.next()));
	}
	public static boolean nestParen(String str) {
		int length = str.length();
		if (length==0) return true;
        if(str.charAt(0)=='('&&str.charAt(length-1)==')') return nestParen(str.substring(1,length-1));
		return false;
	}
}