//Write a method mergeArrays that takes two int arrays sorted from least to 
//greatest as parameters and returns a merged array. YOU MAY NOT USE ANY 
//SORTING ALGORITHMS OR ARRAYS.SORT.
import java.util.*;
public class mergeArrays{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
        	for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println("Please enter number of elements in your second array: ");
		int elementsinarray2 = console.nextInt();
		System.out.println("Please enter your second array: ");
		int[] array2 = new int[elementsinarray2];
		for(int i =0;i<elementsinarray;i++) {
			array2[i] = console.nextInt();
		}
		mergeArrays(array, array2);
		for (int i = 0;i<array.length ;i++ ) {
			System.out.println(array[i] + " ");
		}
	}
	public static int[] mergeArrays(int[] array, int[] array2){
		int[] array3 = new int[array.length+array2.length];
		int counter = 0;
		for (int i = 0;i<array.length ;i++ ) {
			array3[counter++] = array[i];
		}
		for (int i = 0;i<array2.length ;i++ ) {
			array3[counter++] = array2[i];
		}
		int temp = 0;
		for (int j = 0;j<array3.length-1 ;j++ ) {
			for (int i = 1;i<array3.length ;i++ ) {
				if (array3[i]<array3[i-1]) {
					temp = array3[i-1];
					array3[i-1] = array3[i];
					array3[i]=temp;
				}
			}			
		}
		return array3;
	}	
}	
