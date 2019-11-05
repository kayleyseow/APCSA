/*
The Collatz sequence is an iterative sequence defined 
for positive (>=1) integers. The sequence starts with 
a positive integer n. Following it, each term is defined 
as follows:
if n is even, the next term is n/2.
if n is odd, the next term is 3*n+1.
For example, if we start with 13, the sequence is as follows:
13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
For 1 <= n <= 1,000,000, all of the sequences do end at 1.
It's thought (but not proven) that the sequence ends at 1 for all
starting numbers.

Write a program that first reads the console for the number of 
different starting numbers, then proceeds to read the console
for each of those numbers (1 <= n <= 1,000,000). For each input
number, print out  the number of terms in the sequence until it
reaches 1 (including the first and last terms). Finally, print
out the number of terms for your longest sequence.
Ex:
Scanner input: 
3
13 2 5
Your program output:
10
2
6
Longest: 10
*/
import java.util.*;
public class CollatzSequence {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of terms followed by terms: ");
		int terms= console.nextInt();
		int biggest = 0;
		for (int i = 0;i<terms;i++ ) {
			int term= console.nextInt();
			int termresult = (collatz(term));
			if (termresult > biggest) {
				biggest = termresult;
			}
			System.out.println (collatz(term));
		}
		System.out.println ("Longest: " + biggest);

	}
	public static int collatz(int x){
		int y = 1;
		while (x != 1){
			if (x%2==1) {
				x=3*x+1;
				y++;
			}
			else {
				x=x/2;
				y++;
			}
			//System.out.println (x);
		}
		return y++;
	}
}
