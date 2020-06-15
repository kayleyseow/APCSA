//from 2014 APCS practice test
/*
An array of positive integer values has the mountain property if the elements are ordered such that successive values increase until a maximum value (the peak of the mountain) is reached and then the successive values decrease. The Mountain class declaration shown below contains methods that can be used to determine if an array has the mountain property. You will implement two methods in the Mountain class.
a. 
Write the Mountain method getPeakIndex. Method getPeakIndex returns the index of the first peak found in the parameter array, if one exists. A peak is defined as an element whose value is greater than the value of the element immediately before it and is also greater than the value of the element immediately after it. Method getPeakIndex starts at the beginning of the array and returns the index of the first peak that is found or -1 if no peak is found.
b. 
Write the Mountain method isMountain. Method isMountain returns true if the values in the parameter array are ordered as a mountain; otherwise, it returns false. The values in array
are ordered as a mountain if all three of the following conditions hold.
There must be a peak.
The array elements with an index smaller than the peak’s index must appear in increasing order.
The array elements with an index larger than the peak’s index must appear in decreasing order.
In writing isMountain, assume that getPeakIndex works as specified, regardless of what you wrote in part (a).
*/
import java.util.*;
public class Mountain{
	public static boolean isIncreasing (int[] array, int stop){
		if (!(stop>=0&&stop<array.length)){
			//System.out.println("isIncreasing = false, out of bounds");
			return false;
		} 
		for (int i=0;i<stop-1 ;i++ ) {
			if (array[i]>array[i+1]){
				//System.out.println("isIncreasing = false");
				return false;
			}
		}
		//System.out.println("isIncreasing = true");
		return true;
	}
	public static boolean isDecreasing (int[] array, int start){
		if (!(start>=0&&start<array.length)){
			//System.out.println("isDecreasing = false, out of bounds");
			return false;
		} 
		for (int i=start;i<array.length-1;i++){
			if (array[i]<array[i+1]){
				//System.out.println("isDecreasing = false");
				return false;
			} 
		}
		//System.out.println("isDecreasing = true");
		return true;
	}
	public static int getPeakIndex(int[] array){
		int peak = -1;
		for (int i=0;i<array.length;i++){
			if (isIncreasing(array,array[i])==true&&isDecreasing(array,array[i])==true){
				peak=i;
			}
		}
		//System.out.println("peak = "+peak);
		return peak;
	}
	public static boolean isMountain (int[] array){
		if (getPeakIndex(array)==-1||array.length<=0) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int[] array = new int[console.nextInt()];
		System.out.println("Enter your array: ");		
		for (int i=0;i<array.length;i++){
			array[i]=console.nextInt();
		}
		System.out.println("The array is a mountain = "+isMountain(array));
	}
}
