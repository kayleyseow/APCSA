/*Implement four sorts, in this order:

bubbleSort
selectionSort
insertionSort 
mergeSort

The user will supply 10 space-separated integers from the console.
Print each iteration of each sort as in the example shown below.
With 10 elements in your input array, you should print 10 lines of
output, including the original array.

EXCEPTION: for mergeSort, print the original list and final list only.

Example:

input:
4 5 8 19 38 53 7 23 5 23

output:
bubbleSort
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 7, 23, 5, 23, 53]
[4, 5, 8, 19, 7, 23, 5, 23, 38, 53]
[4, 5, 8, 7, 19, 5, 23, 23, 38, 53]
[4, 5, 7, 8, 5, 19, 23, 23, 38, 53]
[4, 5, 7, 5, 8, 19, 23, 23, 38, 53]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]

selectionSort
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 5, 19, 38, 53, 7, 23, 8, 23]
[4, 5, 5, 7, 38, 53, 19, 23, 8, 23]
[4, 5, 5, 7, 8, 53, 19, 23, 38, 23]
[4, 5, 5, 7, 8, 19, 53, 23, 38, 23]
[4, 5, 5, 7, 8, 19, 23, 53, 38, 23]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]

insertionSort
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 7, 8, 19, 38, 53, 23, 5, 23]
[4, 5, 7, 8, 19, 23, 38, 53, 5, 23]
[4, 5, 5, 7, 8, 19, 23, 38, 53, 23]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]

mergeSort
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
*/
import java.util.*;
public class SortAll{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] array1 = new int[10];
		for (int i = 0;i<array1.length ;i++ ) array1[i]=console.nextInt();
		int[] array2 = new int[10];
		for (int i = 0;i<array2.length ;i++ ) array2[i]=array1[i];
		int[] array3 = new int[10];
		for (int i = 0;i<array3.length ;i++ ) array3[i]=array1[i];
		int[] array4 = new int[10];
		for (int i = 0;i<array4.length ;i++ ) array4[i]=array1[i];
		bubsort(array1);
		selsort(array2);
		inssort(array3);
		//mersort(array4);(mergesort has infinite loop)	
		System.out.println("mergeSort");
		System.out.println(Arrays.toString(array4)+"\n"+Arrays.toString(array3));
	}
	public static void bubsort(int[] array){
		System.out.println("bubbleSort");
		System.out.println(Arrays.toString(array));
        int size = array.length;
		for (int i = 0; i < size - 1; i++){
		    for (int j = 0; j < size - i - 1; j++){
		        if (array[j] > array[j + 1]){
		            int temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		        }
		    }
		    System.out.println(Arrays.toString(array));
		}
		System.out.println();
	}	
	public static void selsort(int[] selectionarray){
		System.out.println("selectionSort");
		System.out.println(Arrays.toString(selectionarray));
		int k=0, count = 0;
        for (int i = 0; i < 9; i++){
           	int low = Integer.MAX_VALUE;
            for (int j = k; j < 10; j++) {
                if (selectionarray[j] < low) {
                    low = selectionarray[j];
                    count = j;
                }
            }
            k++;
            int temp = selectionarray[i];
            selectionarray[i] = low;
            selectionarray[count] = temp;
            System.out.println(Arrays.toString(selectionarray));
        }
        System.out.println();
	}
	public static void inssort(int[] insertionarray){
		System.out.println("insertionSort");
		int i, key, j;
	    for (i = 1; i < 10; i++) {
			System.out.println(Arrays.toString(insertionarray));
		    key = insertionarray[i];
		    j = i-1;
			while (j >= 0 && insertionarray[j] > key){
		        insertionarray[j+1] = insertionarray[j];
		        j--;
		    }
		 	insertionarray[j+1] = key;
		}
		System.out.println(Arrays.toString(insertionarray) + "\n");
	}
	public static void mersort(int[] mergearray){
		int a = 0;
        int count = 0;
        System.out.println("mergeSort\n"+Arrays.toString(mergearray));
        for (int i = 0; i < 9; i++){
            int low = Integer.MAX_VALUE;
            for (int j = a; j < 10; j++) {
                if (mergearray[j] < low) {
                    low = mergearray[j];
                    count = j;
                }
            }
            a++;
            int temp = mergearray[i];
            mergearray[i] = low;
            mergearray[count] = temp;
        }
        System.out.println(Arrays.toString(mergearray));
	}
}
