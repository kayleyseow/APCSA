import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String inputstring = console.next();
		int i = 0;
		int j = inputstring.length()-1;
		System.out.println(palindromechecker(inputstring,i,j));
	}
	public static boolean palindromechecker(String s, int i, int j){
		while(i<j){
			if (s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}  
		return true;       
	}
		
}