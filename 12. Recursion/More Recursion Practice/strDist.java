/*
Given a string and a non-empty substring sub, compute recursively the largest substring 
which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/
import java.util.*;
public class strDist{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = console.next();
		System.out.println("Enter SubString: ");
		String sub = console.next();
		System.out.println(strDist(string, sub));
	}
	public static int strDist(String str, String sub) {
		int slength = sub.length();
		int stlength = str.length();
		if(stlength<slength) return 0;
		if(str.substring(0,slength).equals(sub)){
			if (str.substring(stlength-slength, stlength).equals(sub)) return stlength;
		    return strDist(str.substring(0,stlength-1 ), sub);
		}
	    return strDist(str.substring(1), sub);
	}
}