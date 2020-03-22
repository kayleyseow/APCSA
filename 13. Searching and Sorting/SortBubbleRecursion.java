import java.util.*;
public class SortBubbleRecursion{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("bubbleSort (recursive)");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
			System.out.println(Arrays.toString(array));
		bubbleSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
	public static void bubbleSort(int arr[], int n) { 
	    if (n == 1) return; 
	    for (int i=0; i<n-1; i++) if (arr[i] > arr[i+1]) { 
	        int temp = arr[i]; 
	        arr[i] = arr[i+1]; 
	        arr[i+1] = temp; 
	    } 
	    bubbleSort(arr, n-1); 
	} 
}