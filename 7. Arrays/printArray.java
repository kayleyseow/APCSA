//this code prints the entered array with a space and a new line after each element
import java.util.*;
public class printArray{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
        for(int i =0;i<elementsinarray;i++) {
            array[i] = console.nextInt();
        }
        printanarray(array);
	}
	//prints an array with spaces between the elements and new line after the last element
	public static void printanarray(int[] array){
		for (int i = 0;i<array.length ;i++ ) {
			System.out.print(array[i]+" ");
		}
		System.out.println(array[array.length-1]);
	}
}
