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

}	
