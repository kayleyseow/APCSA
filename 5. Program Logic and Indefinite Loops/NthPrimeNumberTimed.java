//code to find nth prime number with timers
import java.util.*;
public class NthPrimeNumberTimed{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("enter integer n for nth prime (1st prime = 2): ");
		int nth= console.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("Prime #" + nth + " is " + primenumber(nth));
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		System.out.println("end time : " + endTime + "start time :" + startTime);
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
