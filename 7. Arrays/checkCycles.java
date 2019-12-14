/*
Write a method called checkCycles() that takes an integer array and a 
cycle length N as the input and the outputs true if the array contains a 
cycle length of N. Consider each element of the array as pointing to the 
net index in a walk through the array. If you start at the index i_0 and 
go to index arr[i_0] and continue this process, a cycle is formed if you 
eventually come back to the same element. The number of hops you 
take to come back to the same element. The number of hops you take 
to come back to the same element is the cycle length.
*/

import java.util.*;
public class checkCycles{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the number of elements in array");
		int elements = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elements];
        	for(int i =0;i<elements;i++) {
           		array[i] = console.nextInt();
        	}	
        	System.out.println("Please enter an integer cycle length: ");
        	int cyclelength = console.nextInt();
        	System.out.println(checkCycles(array,cyclelength));
	}
	public static boolean checkCycles(int[] array, int n){
		int next = n;
		for (int i = 0;i<array.length ;i++ ) {
			if (next>=array.length||next<0) {
				return false;
			}
			else{
				next = array[next];
			}
			if (next==n) {
				return true;
			}
		}
		return false;
	}
}
