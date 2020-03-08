/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the 
string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/
import java.util.*;
public class countX{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(countX(console.next()));
	}
	public static int countX(String str) {
	  	if (str.length()==0) return 0;
	  	if (str.charAt(0) == 'x') return 1+ countX(str.substring(1));
	 	return countX(str.substring(1));
	}
}