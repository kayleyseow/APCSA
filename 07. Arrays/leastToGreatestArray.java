//checks to see if the elements in an array are from least to greatest
import java.util.*;
public class leastToGreatestArray{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		leastToGreatestArray(array);
	}
	public static void leastToGreatestArray(int[] array){
		boolean ltog = true;
		for (int i = 1;i<array.length ;i++ ) {
			if (array[i]>array[i-1]) {
			} else {
				ltog = false;
				System.out.println(ltog);
			}
		}
		System.out.println(ltog);
	}
}
