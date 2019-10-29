/*
Write a method that takes in a string and returns the character
with the highest ASCII value, then returns all the characters in the
string in ascending ASCII order.

Example of input/output:

Enter string: BigString
max char: t
in order: BSggiinrt
*/
import java.util.*;
public class StringMax{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter string: ");
		String word = console.next();
		System.out.println("max char:     "+ maxchar(word));
		System.out.println("in order:     "+ inorder(word));
	}
	public static char maxchar(String input){//create parameter
		int length = input.length();//set the length for the forloop later
		int x = (int)input.charAt(0);//create empty integer, typecase character to ASCII value
		for (int i=1;i<length;i++ ) {//forloop. self explanitory
			if (x < (int)input.charAt(i)) {//if the x is less than the next character
				x = (int)input.charAt(i);//x contains the largest number
			}	
		}
		return (char)x;//returns the character with the largest ASCII number
	}
	public static String inorder(String input){
		int length = input.length();//set the length for the forloop later
		char temp;
		char ch [] = input.toCharArray();
		String m = "";//blank string 
        for (int i = 0; i < length-1; i++){ //bubblesort
            for (int j = 0; j < length-i-1; j++){ 
                if ( ch [j]> ch [j+1]) 
                { 
                    // swap (int)input.charAt(j)+1] and arr[i] 
                    temp = ch [j]; 
                    ch[j] = ch [j+1]; 
                    ch[j+1] = temp;  
                } 
            }    
        } 
        for (int i = 0; i < length;i++ ) {//forloop because won't complie properly 
					m = m + ch[i];
		}
        return m;//return statement
	}
}