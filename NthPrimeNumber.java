/*
Write a program to find the nth prime, where n is an integer supplied
by the user. The 1st prime is 2. Assume n <= 1,000,000.
*/
import java.util.*;
public class NthPrimeNumber{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("enter integer n for nth prime (1st prime = 2): ");
		int nth= console.nextInt();
		System.out.println("Prime #" + nth + " is " + primenumber(nth));
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