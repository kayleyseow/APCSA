/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.
I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
Roman numerals are usually written largest to smallest from left to right. But a number
like 4 is not written as IIII. It is written as IV.
Because the one is before the five, we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Your Task:
Given a range of values, convert all integers within the range (inclusive) to roman
numerals, printing them out with one roman numeral per line.
Convert all integers in the range from 1 to 3999 to roman numerals and them out with
one roman numeral per line.
Example of input/output:
2 6
II
III
IV
V
VI
*/
import java.util.*;
public class IntegerToRomanNumeral{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int startnumber= console.nextInt();
		int endnumber= console.nextInt();
		String result = "";
		for (int i = startnumber;i <= endnumber ; i++) {
			System.out.println (romannumeral(i));
		}
	}
	public static String romannumeral(int integer){
		String rnumeral = "";
		while (integer >= 1000) {
	        rnumeral += "M";
	        integer -= 1000;        
	    }
	    while (integer >= 900) {
	        rnumeral += "CM";
	        integer -= 900;
	    }
	    while (integer >= 500) {
	        rnumeral += "D";
	        integer -= 500;
	    }
	    while (integer >= 400) {
	        rnumeral += "CD";
	        integer -= 400;
	    }
		while (integer >= 100) {
			rnumeral += "C";
			integer -= 100;
	    }
	    while (integer >= 90) {
	        rnumeral += "XC";
	        integer -= 90;
	    }
	    while (integer >= 50) {
	        rnumeral += "L";
	        integer -= 50;
	    }
	    while (integer >= 40) {
	        rnumeral += "XL";
	        integer -= 40;
	    }
	    while (integer >= 10) {
	        rnumeral += "X";
	        integer -= 10;
	    }
	    while (integer >= 9) {
	        rnumeral += "IX";
	        integer -= 9;
	    }
		while (integer >= 5) {
		  rnumeral += "V";
		  integer -= 5;
		}
		while (integer >= 4) {
	        rnumeral += "IV";
	        integer -= 4;
	    }
	    while (integer >= 1) {
	        rnumeral += "I";
	        integer -= 1;
	    }
	    return rnumeral;
	}
}
