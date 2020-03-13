/*
Given a string that contains a single pair of parenthesis, compute recursively a new string 
made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/
import java.util.*;
public class parenBit{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(parenBit(console.next()));
	}
	public static String parenBit(String str) {
		if (str.charAt(0) != '(') {
		    return parenBit(str.substring(1));
		}
	    if (str.charAt(str.length()-1) != ')') {
		    return parenBit(str.substring(0, str.length()-1));
		}
		return str;
		// Solution notes: this is tricky. Is the first char a '('?
	    // If not, recur, removing one char from the left of the string.
    	// Eventually this gets us to '(' at the start of the string.
		// If the first char is '(', then recur similarly, removing one char from
		// the end of the string, until it is ')'.
		// Now the first and last chars are ( .. ) and you're done.
	}
}