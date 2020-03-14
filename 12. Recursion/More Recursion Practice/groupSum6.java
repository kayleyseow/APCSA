/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the 
start index, such that the group sums to the given target? However, with the additional 
constraint that all 6's must be chosen. (No loops needed.)

groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
*/
import java.util.*;
public class groupSum6{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Start: ");
		int start = console.nextInt();
		System.out.println("Enter Length of the Array: ");
		int arraylength = console.nextInt();
		int[] array = new int[arraylength];
		for (int i = 0;i<arraylength;i++ ) array[i]=console.nextInt();
		System.out.println("Enter Target: ");
		System.out.println(groupSum6(start, array, console.nextInt()));
	}
	public static boolean groupSum6(int start, int[] nums, int target) {
	  	if (start == nums.length){
	  		if (target == 0) return true;
	  	    return false;
	  	}
	  	if (nums[start]==6) return groupSum6(start + 1, nums, target - nums[start]);
	  	if (groupSum6(start + 1, nums, target - nums[start])) return true;
	  	return groupSum6(start+1, nums, target);
	}
}
