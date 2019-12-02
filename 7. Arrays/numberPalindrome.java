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
		public static boolean Palindrome(int[] array){
		boolean tf = true;
		int[] array2 = new int[array.length];
		int counter = array.length-1;
		for (int i = 0;i<array.length ;i++ ) {
			array2[counter--] = array[i];
		}
		for (int i = 0;i<array.length ;i++ ) {
			if (array2[i] == array[i]) {
			} else{
				tf = false;
			}
		}
		return tf;
	}
}	
