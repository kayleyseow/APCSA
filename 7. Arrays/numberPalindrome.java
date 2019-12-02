import java.util.*;
public class numberPalindrome{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
        	for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		Palindrome(array);
		for (int i = 0;i<array.length ;i++ ) {
			System.out.println(array[i] + " ");
		}
	}

}	
