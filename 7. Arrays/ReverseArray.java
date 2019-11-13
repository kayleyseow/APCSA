/*
Write a program that reverses the elements in an array and prints them out
in the format below. The first input to your program will be the size of
the array, followed by the integers in your array. Use at least one other
method besides main(), preferably one that takes an array as a parameter.
Example:
Input: 
4
1
2
3
4
Output: 
[4, 3, 2, 1]
*/
import java.util.*;
public class ReverseArray{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numbersinarray = console.nextInt();
		int[] integerarray = new int[numbersinarray];
		for (int i = 0;i<numbersinarray ;i++ ) {
			integerarray[numbersinarray-i-1]=console.nextInt();
		}
		System.out.print("[");
		for (int i = 0;i<numbersinarray ;i++ ) {
			System.out.print(integerarray[i]);
			if (i<numbersinarray-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
