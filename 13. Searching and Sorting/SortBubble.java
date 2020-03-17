/*
Implement bubbleSort.

The user will supply 10 space-separated integers from the console.
HyperGrade examples are formatted using Arrays.toString(), but you
are free to format "by hand." Print each iteration of each sort as
in the HyperGrade example shown below. With 10 elements in
your input array, you should print 10 lines of output, including the
original array.

Example:

input
9 8 7 6 5 4 3 2 1 0

output:
bubbleSort
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
[8, 7, 6, 5, 4, 3, 2, 1, 0, 9]
[7, 6, 5, 4, 3, 2, 1, 0, 8, 9]
[6, 5, 4, 3, 2, 1, 0, 7, 8, 9]
[5, 4, 3, 2, 1, 0, 6, 7, 8, 9]
[4, 3, 2, 1, 0, 5, 6, 7, 8, 9]
[3, 2, 1, 0, 4, 5, 6, 7, 8, 9]
[2, 1, 0, 3, 4, 5, 6, 7, 8, 9]
[1, 0, 2, 3, 4, 5, 6, 7, 8, 9]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
import java.util.*;
public class SortBubble{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("bubbleSort");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
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
}
