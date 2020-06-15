//from 2020 APCS practice test 
import java.util.*;
public class Hailstone{
	/** Returns the length of a hailstone sequence that starts with n,
	* as described in part (a).
	* Precondition: n > 0
	*/
	public static int hailstoneLength(int n){
		/* to be implemented in part (a) */ 
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (n>0){
			array.add(n);
			if (n==1) break;
			else if (n%2==0) n=n/2;
			else n=(n*3)+1;// (n%2==1) 
		}
		return array.size();
	}

  	/** Returns true if the hailstone sequence that starts with n is considered long
	* and false otherwise, as described in part (b).
	* Precondition: n > 0
	*/
	public static boolean isLongSeq(int n){
		/* to be implemented in part (b) */ 
		if ((hailstoneLength(n))>n) return true;
		return false;
	}
  	/** Returns the proportion of the first n hailstone sequences that are considered long,
	* as described in part (c).
	* Precondition: n > 0
	*/
	public static double propLong(int n){
		/* to be implemented in part (c) */ 
		double temp=0;
		for (int i=1;i<=n;i++){
			if (isLongSeq(i)) temp++;
		}
		return (double) (temp/n);
	}
	// There may be instance variables, constructors, and methods not shown.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = console.nextInt();
		System.out.println(hailstoneLength(n));
		System.out.println(isLongSeq(n));
		System.out.println(propLong(n));
	}
}
