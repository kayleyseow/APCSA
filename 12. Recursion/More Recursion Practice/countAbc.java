/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given 
string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/
import java.util.*;
public class countAbc{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(countAbc(console.next()));
	}
	public static int countAbc(String str) {
		if (str.length()<3) return 0;
		if (str.charAt(0)=='a'&&str.charAt(1)=='b'&&str.charAt(2)=='c')return 1+countAbc(str.substring(2));
		if (str.charAt(0)=='a'&&str.charAt(1)=='b'&&str.charAt(2)=='a')return 1+countAbc(str.substring(1));
		return countAbc(str.substring(1));
	}
}