/*
Write a program that takes in a string of parentheses like ()()(((())))() and
determines if all the parentheses within the string are matched correctly. If
matched correctly, print the value of the maximum "depth" of the string of
parentheses.  Do not use arrays.

If you think of an open parenthesis as going one unit down a valley
and a close parenthesis as going one unit up a valley, the maximum depth of
the string of the parentheses is the maximum depth you reach as you traverse
the valley/parentheses string, starting from zero.

Note that (()) is matched correctly, but ))(( is not matched correctly.  In other
words, a correctly matched parenthesis string is what you would find in a valid
algebraic expression.

Further examples:
((()) is not matched.
()))(( is not matched
((()((4)))) is matched and has a maximum depth of 4 where the 4 is written.
((()(((5)))())) is matched and has a maximum depth of 5 where the 5 is written.
*/
import java.util.*;
public class Parentheses{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your string below:");
		String parenthesis= console.next();
		int length = parenthesis.length();
		int valley = 0;
		int highest = 0;
		for (int i=0;i<length ;i++ ) {
			if (valley<0) {
				System.out.println("false");
				break;
			}
			if ((int)parenthesis.charAt(i) == 40){
				valley++;
				if (valley>highest) {
					highest=valley;
				}
			}
			else if ((int)parenthesis.charAt(i) == 41) {
				valley--;
			}
		}
		if (valley == 0) {
			System.out.println("true");
			System.out.println(highest);	
		}
		else if (valley>0){
			System.out.println("false");
		}
   	}
}
