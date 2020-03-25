/*
Implement selectionSort.
The user will supply 10 space-separated integers from the console.
HyperGrade examples are formatted using Arrays.toString(), but you
are free to format "by hand." Print each iteration of each sort as
in the HyperGrade example shown below. With 10 elements in
your input array, you should print 10 lines of output, including the
original array.

Example:

input
27 301 5 -18 27 75 157 -82 0 10

output:
selectionSort

[27, 301, 5, -18, 27, 75, 157, -82, 0, 10]
[-82, 301, 5, -18, 27, 75, 157, 27, 0, 10]
[-82, -18, 5, 301, 27, 75, 157, 27, 0, 10]
[-82, -18, 0, 301, 27, 75, 157, 27, 5, 10]
[-82, -18, 0, 5, 27, 75, 157, 27, 301, 10]
[-82, -18, 0, 5, 10, 75, 157, 27, 301, 27]
[-82, -18, 0, 5, 10, 27, 157, 75, 301, 27]
[-82, -18, 0, 5, 10, 27, 27, 75, 301, 157]
[-82, -18, 0, 5, 10, 27, 27, 75, 301, 157]
[-82, -18, 0, 5, 10, 27, 27, 75, 157, 301]

*/
import java.util.*;
public class SortSelection{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("selectionSort");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
		System.out.println(Arrays.toString(array));
		int k=0, count = 0;
        for (int i = 0; i < 9; i++){
           	int low = Integer.MAX_VALUE;
            for (int j = k; j < 10; j++) {
                if (array[j] < low) {
                    low = array[j];
                    count = j;
                }
            }
            k++;
            int temp = array[i];
            array[i] = low;
            array[count] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
	}
}
