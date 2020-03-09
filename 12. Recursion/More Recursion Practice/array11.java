/*
Given an array of ints, compute recursively the number of times that the value 11 appears 
in the array. We'll use the convention of considering only the part of the array that begins 
at the given index. In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0.

array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
*/
import java.util.*;
public class array11{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter elements in array : \nEnter array: \n");
		int elementsinarray = console.nextInt();
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println(array11(array, 0));
	}
	public static int array11(int[] nums, int index) {
	  	if (nums.length == index) return 0;
	    if (nums[index] == 11 ) return 1+array11(nums, index+1);
	    return array11(nums, index+1);
	}
}