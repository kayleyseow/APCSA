/*
Write a program that takes in a user input from the console which contains:
1. an integer n which is the length of an integer array on line 1
2. the n integers of the array from lines 2 to n+1.

The program should then compute the standard deviation of the array of integers.

Standard deviation is defined as the square root of [(the sum of the squares of
the differences between each element and the mean) / (one less than the
number of elements)].
*/
import java.util.*;
public class StandardDeviation{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the integer array dimension: ");
		int numbersinarray = console.nextInt();
		System.out.println("Please enter the array elements: ");
		int[] integerarray = new int[numbersinarray];
		for (int i = 0;i<numbersinarray ;i++ ) {
			integerarray[i]=console.nextInt();
		}
		System.out.printf("Standard deviation = %.3f%n",stdev(integerarray));
	}
	public static double arrayMean(int[] array){
		double sum = 0;
		for (int i=0;i<array.length ;i++ ) {
			sum = sum+array[i];
		}
		double mean = sum/array.length;
		return mean;
	}
	public static double stdev(int[] array){
		double mean = arrayMean(array);
		double deviation = 0.0;
		double sqdeviation;
		double sum=0.0;
		for (int i = 0;i<array.length;i++ ) {
			deviation = (double)array[i]-mean;
			sqdeviation = deviation*deviation;
			sum = sum+sqdeviation;
		}
		return (double)Math.sqrt(sum/(array.length-1));
	}
}
