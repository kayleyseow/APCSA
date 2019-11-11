/*
Write a program that takes console input for a positive integer value
n (n >= 2) on the first line and then prints out the greatest prime number
less than or equal to n and the greatest prime factor of n
on the two following lines. Aim for efficiency.
*/
import java.util.*;
public class Prime1{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter positive integer: ");
		int positiveintegervalue= console.nextInt();
		for (int i = positiveintegervalue;i>=2 ;i-- ) {
			if (ispn(i)==true) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(primefactor(positiveintegervalue));
   	}
   	public static int primefactor(int x){
   		int factor = 0;
   		for (int i = 1;i<=x;i++ ) {
   			if (x%i==0) {
   				if (ispn(i)==true) {
   					factor = i;
   				}
   			}
   		}
   		return factor;
   	}
	public static boolean ispn(int x){
	
		if (x <= 1) {
			return false;
		}
		for (int i = 2;i*i <= x;i++ ) {
			if (x%i ==0) {
				return false;
			}
		}
		return true;
	}
	public static int primenumber(int x){
		int num=1;
		int nthnumber=2;
		if (x==1) {
			return 2;
		}
		while (nthnumber <= x) {
			num = num + 2;
			if (ispn(num) == true) {
				nthnumber++;
			}
		}
		return num;
	}
}