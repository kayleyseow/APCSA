/*Oh no! Amy Belle forgot how decimal placeholders work!
Given an integer n and position k, please write a java program to compute the kth digit in n with 0-based indexing from right to left. You may assume n >= 0 and k >= 0. 
Input:
543561 4
Output:
4
*/
import java.util.*;
public class KthDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//set the ints
		System.out.println("Please enter number");
        int x = sc.nextInt();
        System.out.println("Please enter integer needed");
        int y = sc.nextInt();

       for(int i = 0; i < y; i++) {
           x = x/10;
       }
       //println remainder
       System.out.println(x%10);
	}
}
