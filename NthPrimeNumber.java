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
	public static int primenumber(int x){
		int num=1, nthnumber=0, i;
		while (nthnumber < x){
	      num=num+1;
	      for (i = 2; i <= num; i++){
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        nthnumber = nthnumber+1;
	      }
	    }
	    return num;
	}
}
