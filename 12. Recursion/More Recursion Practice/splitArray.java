/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of 
the two groups are the same. Every int must be in one group or the other. Write a 
recursive helper method that takes whatever arguments you like, and make the initial call 
to your recursive helper from splitArray(). (No loops needed.)

splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
*/
import java.util.*;
public class splitArray{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Length of the Array: ");
		int arraylength = console.nextInt();
		int[] array = new int[arraylength];
		for (int i = 0;i<arraylength;i++ ) array[i]=console.nextInt();
		System.out.println(splitArray(array));
	}
	public static boolean splitArray(int[] nums){
	  	return sidesAreEqual(nums, 0, 0);	
	}
	public static boolean sidesAreEqual(int[] nums, int i, int balance){
		if(i == nums.length)return (balance == 0);
		if(sidesAreEqual(nums, i + 1, balance + nums[i]))return true;
		return sidesAreEqual(nums, i + 1, balance - nums[i]);
	}
}
