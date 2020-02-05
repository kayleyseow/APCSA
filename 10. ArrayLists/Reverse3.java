/*
Write a program Reverse3 that accepts an ArrayList of integer values as
a parameter and reverses each successive sequence of three values in the
list. If the list has remaining values that are not part of a sequence of three,
those values are unchanged. For example, if a list stores values
[3, 8, 19, 42, 7, 26, 19, -8], after the call the list should store the values
[19, 8, 3, 26, 7, 42, 19, -8].
The first sequence of three (3, 8, 19) has been reversed to be (19, 8, 3).
The second sequence (42, 7, 26) has been reversed to be (26, 7, 42). The
remaining 19 and -8 are unchanged because they are not a sequence of
three values.
The end of user input will be signified using a sentinel value of 0.  Your code
need not be robust. The user may enter nothing but the sentinel value, i.e.
an empty list.
*/

import java.util.*;
public class Reverse3{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
		ArrayList<Integer> consoleinputarraylist = new ArrayList<Integer>();
		int input = 0;
		do{
            input = console.nextInt();
            if (input!=0) {
	        	consoleinputarraylist.add(input);
	        }
	    }
		while(input!=0);
		System.out.println("Your original list: "+ consoleinputarraylist+"\n");
		for(int i = 0; i < consoleinputarraylist.size() - 2; i += 3){
			Integer temporary = consoleinputarraylist.get(i);
			Integer temporary2 = consoleinputarraylist.get(i + 2);
			consoleinputarraylist.set(i, temporary2);
			consoleinputarraylist.set(i + 2, temporary);
		}
		System.out.println("Your reversed3 list: "+ consoleinputarraylist);
	}
}