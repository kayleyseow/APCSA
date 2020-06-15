//from 2007 APCS exam, Q1
/*
A positive integer is called a "self-divisor" if every decimal digit of the number is a divisor of the number, 
that is, the number is evenly divisible by each and every one of its digits. For example, the number 128 is a 
selfdivisor because it is evenly divisible by 1, 2, and 8. However, 26 is not a self-divisor because it is not 
evenly divisible by the digit 6. Note that 0 is not considered to be a divisor of any number, so any number 
containing a 0 digit is NOT a self-divisor. There are infinitely many self-divisors.
a. 
Write method isSelfDivisor, which takes a positive integer as its parameter. This method returns 
true if the number is a self-divisor; otherwise, it returns false.
b. 
Write method firstNumSelfDivisors, which takes two positive integers as parameters, representing 
a start value and a number of values. Method firstNumSelfDivisors returns an array of size num 
that contains the first num self-divisors that are greater than or equal to start.
For example, the call firstNumSelfDivisors(10, 3) should return an array containing the values 11,
12, and 15, because the first three self-divisors that are greater than or equal to 10 are 11, 12, 
and 15.
In writing firstNumSelfDivisors, assume that isSelfDivisor works as specified, regardless of what 
you wrote in part (a).
*/
import java.util.*;
public class SelfDivisor{
	/** Precondition: n > 0
	* Return true if every decimal digit of number is a divisor of number;
	* 		 false otherwise
	*/
	public static boolean isSelfDivisor(int number){
		/* to be implemented in part (a) */ 
		int original=number;
		int temp=0;
		while (number>0){
			temp=number%10;
			//System.out.println("temp = "+temp);
			if (temp==0||original%temp!=0) return false;
			number/=10;
		}
		return true;
	}
  	/** start-starting point for values to be cheecked
  	*	Precondiion: start>0
	* 	num-the size of the array to be returned
	* 	Precondition: num > 0
	*	return an array containing the first num integers >= start that are self-divisors
	*/
	public static int[] firstNumSelfDivisors(int start, int num){
		/* to be implemented in part (b) */ 
		int[] array = new int[num];
		int index =0;
		while (index<num){
			if(isSelfDivisor(start)==true){
				array[index]=start;
				index++;
			}
			start++;
		}
		return array;
	}
	// There may be instance variables, constructors, and methods not shown.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = console.nextInt();
		System.out.println("Enter start: ");
		int start = console.nextInt();
		System.out.println("Enter num: ");
		int num = console.nextInt();
		System.out.println(isSelfDivisor(number));
		System.out.println(Arrays.toString(firstNumSelfDivisors(start, num)));
	}
}
