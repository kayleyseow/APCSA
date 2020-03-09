/*
Given an array of ints, compute recursively if the array contains a 6. We'll use the 
convention of considering only the part of the array that begins at the given index. In this 
way, a recursive call can pass index+1 to move down the array. The initial call will pass in 
index as 0.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
*/
import java.util.*;
public class array6{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter elements in array : \nEnter array: \n");
		int elementsinarray = console.nextInt();
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println(array6(array, 0));
	}
	public static boolean array6(int[] nums, int index) {
	  if (nums.length == index ) return false;
	  if (nums[index]==6 ) return true;
	  return array6(nums, index+1);
	}

}