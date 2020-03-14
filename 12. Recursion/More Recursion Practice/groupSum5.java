/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the 
group sums to the given target with these additional constraints: all multiples of 5 in the 
array must be included in the group. If the value immediately following a multiple of 5 is 1, 
it must not be chosen. (No loops needed.)

groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false
*/
import java.util.*;
public class groupSum5{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Start: ");
		int start = console.nextInt();
		System.out.println("Enter Length of the Array: ");
		int arraylength = console.nextInt();
		int[] array = new int[arraylength];
		for (int i = 0;i<arraylength;i++ ) array[i]=console.nextInt();
		System.out.println("Enter Target: ");
		System.out.println(groupSum5(start, array, console.nextInt()));
	}
	public static boolean groupSum5(int start, int[] nums, int target) {
	  	if (start >= nums.length){
	  	    if (target == 0) return true;
	  	    return false;
	  	}
	  	if (nums[start]%5==0){
	  	    if (start<nums.length-1&&nums[start+1]==1) return groupSum5(start + 2, nums, target - nums[start]);
	  	    return groupSum5(start + 1, nums, target - nums[start]);
	  	}
	  	if (groupSum5(start + 1, nums, target - nums[start])) return true;
	  	return groupSum5(start+1, nums, target);
	}
}
