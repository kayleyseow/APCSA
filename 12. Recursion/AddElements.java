/*
Write a recursive program to find the sum of all the elements in an array.
Use a helper method to simplify the method call for the client.
*/
import java.util.*;
public class AddElements {
	public static void main(String[] args) {
		Scanner console  = new Scanner(System.in);
		System.out.println("Enter size of integer array: ");
		int number = console.nextInt();
		System.out.println("Enter n integers separated by spaces: ");
		int[] integerarray = new int[number];
		for (int i = 0;i<number ;i++ ) {
			integerarray[i]=console.nextInt();
		}
		System.out.println("The sum of the elements in your list: "+ addedelements(integerarray, number));
	}
	public static int addedelements(int[] array, int length){
		if (length<=0) {
			return 0;
		}
		return (addedelements(array, length-1)+array[length-1]);
	}
}