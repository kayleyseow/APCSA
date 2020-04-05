//Write a program that takes continuously takes string inputs until 
//the user inputs the string “null”, at which point the program will
//print out all inputted strings with a space of separation between each
//string. There must not be any spaces at the end or the beginning of 
//the String.

import java.util.*;
public class StringPrint{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "";
        while(true) {
            String s = input.next();
            if (!s.equals("null")) {
                output += s + " ";
            }
            else {
                break;
            }
        }
        output = output.substring(0, output.length()-1);
        System.out.println(output);
    }
}
