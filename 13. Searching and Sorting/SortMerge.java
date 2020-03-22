/*
Implement mergeSort.

The user will supply 10 space-separated integers from the console.
The HyperGrade example is formatted using Arrays.toString(), but you
are free to format "by hand." Print the original array and final
sorted array only.

The structure of your program is up to you.

Example:

input:
4 5 8 19 38 53 7 23 5 23

output:
mergeSort
[4, 5, 8, 19, 38, 53, 7, 23, 5, 23]
[4, 5, 5, 7, 8, 19, 23, 23, 38, 53]
*/
import java.util.*;
public class SortMerge{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] arr = new int[10];
        for(int i = 0; i < 10; i++) arr[i] = console.nextInt();
        System.out.println("mergeSort\n"+ Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) l[i] = a[i];
        for (int i = mid; i < n; i++) r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        //System.out.println(Arrays.toString(a)+Arrays.toString(l));
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }
        while (i < left) a[k++] = l[i++];
        while (j < right) a[k++] = r[j++];
    }
}