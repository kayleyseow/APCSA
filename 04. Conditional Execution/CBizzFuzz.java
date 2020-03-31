/* 
Write a program that uses a Scanner to receive one integer "x" from
the user from the console. Print out the sum of all of the numbers
less than x that are multiples of 3 or 5, but not 15. 
Example input:
17
Output:
45

Example input:
1337
Output:
356445

(credit to Project Euler #1)
*/
import java.util.*;
public class CBizzFuzz {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int posint= console.nextInt();
		System.out.println(multiples(posint));
	}
	public static int multiples(int x){
		int y = 0;
		for (int i = 1; i <x; i++) {
			if (i%15 == 0) {
				y=y;
			} else if (i%3 == 0){
				y=i+y;				
			} else if (i%5 == 0){
				y=i+y;
			}
		}
		return y;
	}
}
