/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears 
in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/
import java.util.*;
public class countHi{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(countHi(console.next()));
	}
	public static int countHi(String str) {
	  	if (str.length()<2) return 0;
		if (str.charAt(0) == 'h'&&str.charAt(1) == 'i') return 1+ countHi(str.substring(2));
		return countHi(str.substring(1));
	}
	/*
	*public static int countHi(String str) {
	*  	if (str.length() <= 1) return 0;
	* 	int count = 0;
	*  	if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
	*  	return count + countHi(str.substring(1));
	*}
	*/
}