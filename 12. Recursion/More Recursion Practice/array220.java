/*
Given an array of ints, compute recursively if the array contains somewhere a value 
followed in the array by that value times 10. We'll use the convention of considering only 
the part of the array that begins at the given index. In this way, a recursive call can pass 
index+1 to move down the array. The initial call will pass in index as 0.

array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
*/
import java.util.*;
public class array220{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter elements in array : \nEnter array: \n");
		int elementsinarray = console.nextInt();
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println(array220(array, 0));
	}
	public static boolean array220(int[] nums, int index) {
	  	if (index >= nums.length-1) return false;
	    if (nums[index+1] == nums[index]*10)return true;
	    return array220(nums, index+1);
	}
}