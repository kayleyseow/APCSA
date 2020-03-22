import java.util.*;
public class SortInsertionRecursion{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("insertionSort (recursive)");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
        System.out.println(Arrays.toString(array));
        insertionSortRecursive(array, array.length);
		System.out.println(Arrays.toString(array));
	}
    public static void insertionSortRecursive(int arr[], int n) { 
        if (n <= 1) return; 
        insertionSortRecursive( arr, n-1 ); 
        int last = arr[n-1]; 
        int j = n-2; 
        while (j >= 0 && arr[j] > last) { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 
}