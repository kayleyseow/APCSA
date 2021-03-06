/*
Write a program that uses a scanner to input an integer N followed
by N strings, then prints the sum of the characters' ASCII values.
Note: Using nextLine() requires that console inputs be separated by
returns.
*/
import java.util.*;
public class FindASCIISum{
	public static void main(String[] args) {
     	Scanner console = new Scanner(System.in);
	int numberOfString = console.nextInt();
	String userString = console.nextLine();
        int stringsum = 0;
        for(int i = 0; i < numberOfString; i++){
			userString = console.nextLine();
			stringsum = stringsum + asciisum(userString);
		}
		System.out.println(stringsum);  
	}
	public static int asciisum(String inputstring){ //int returns an integer value 
		int cal = 0;
	    	for (int i = 0; i < inputstring.length(); i++){// length is stored as an integer hence its place in the forloop
	    		cal = cal + (int) inputstring.charAt(i);
	    	}
		return cal;
	}
}
