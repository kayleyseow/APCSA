import java.util.*;
public class SortMergeIterative{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] array = new int[10];
        for(int i = 0; i < 10; i++) array[i] = console.nextInt();
        System.out.println("mergeSort (iterative)\n"+ Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] array) {
        if(array == null)return; 
        if(array.length > 1) { 
            int mid = array.length / 2; 
            int[] left = new int[mid]; 
            for(int i = 0; i < mid; i++) left[i] = array[i]; 
            int[] right = new int[array.length - mid]; 
            for(int i = mid; i < array.length; i++) right[i - mid] = array[i]; 
            mergeSort(left); 
            mergeSort(right); 
            int i = 0; 
            int j = 0; 
            int k = 0; 
            while(i < left.length && j < right.length) { 
                if(left[i] < right[j]) { 
                    array[k] = left[i]; 
                    i++; 
                } 
                else{ 
                    array[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            while(i < left.length){ 
                array[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length){ 
                array[k] = right[j]; 
                j++; 
                k++; 
            } 
        }
    }
}