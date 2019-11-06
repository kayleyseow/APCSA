/*
Write a method that takes a String and an integer n as its parameters 
and transforms the first n characters of the String to uppercase. (You
cannot use the .toUpperCase() function) You may assume that the String
only contains lowercase letters and that there are no spaces or 
characters other than letters within the String. Also account for
Strings that also may contain uppercase letters.
*/
public class chapter3ReviewThree{
	public static void main(String[] args) {
		System.out.println("the uppercase string is:" + upperstring("welcome", 2));
	}
	public static String upperstring(String sin, int n){
		int length = sin.length();
		String sout = "";

		for (int i = 0; i < n ; i++) {
			sout = sout + (char)(sin.charAt(i)-32);
		}
		for (int i = n; i < length ; i++) {
			sout = sout + sin.charAt(i)
		}
		return sout;	
	}
}
