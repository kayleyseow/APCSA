/*
Write a program that takes in a user input from console which contains:
1. an integer n which is the length of an integer array on line 1
2. the n integers of the array from lines 2 to n+1. 
The program should then compute the term in the array with the largest deviation from the mean.
*/
import java.util.*;
public class GreatestDeviation{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numbersinarray = console.nextInt();
		int[] integerarray = new int[numbersinarray];
		for (int i = 0;i<numbersinarray ;i++ ) {
			integerarray[i]=console.nextInt();
		}
		System.out.println(gdeviation(integerarray));
	}
	public static double arrayMean(int[] array){
		double sum = 0;
		for (int i=0;i<array.length ;i++ ) {
			sum = sum+array[i];
		}
		double mean = sum/array.length;
		return mean;
	}
	public static int gdeviation(int[] array){
		double deviation = 0.0;
		int returnnumber = array[0];
		double mean = arrayMean(array);
		for (int i = 0;i<array.length;i++ ) {
			if (Math.abs((double)array[i]-mean)>deviation) {
				returnnumber = array[i];
				deviation = Math.abs((double)array[i]-mean);
			}
		}
		return returnnumber;
	}
}
