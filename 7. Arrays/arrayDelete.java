//deletes an element at a certain index of the array
import java.util.*;
public class arrayDelete{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println("Please enter index which you want to delete: ");
		int indexdelete = console.nextInt();
		arrayDelete(array,indexdelete);
	}
	public static void arrayDelete(int[] array, int x){
		if (x<0||x>=array.length) {
			for(int i =0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
		else {
			int[] deleted = new int[(array.length-1)];
			int counter = 0;
			for (int i = 0;i<array.length;i++ ) {
				if (i!=x) {
					deleted[counter] = array[i];
					System.out.println(array[i]);
					counter++;
				}		
			}
		}
	}
}	
