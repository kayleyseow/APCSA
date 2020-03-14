import java.util.*;
public class ReverseString{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String: ");
		System.out.println(reverseString(console.next()));
	}
	public static String reverseString(String str) {
		if (str.length()==1) return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}