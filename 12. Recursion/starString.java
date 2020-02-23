import java.util.*;
public class starString{
	public static void main(String[] args) throws IllegalArgumentException{
		Scanner console = new Scanner(System.in);
		int nthpower = console.nextInt();
		System.out.println(printstarstring(nthpower));
	}
	public static String printstarstring(int num){
		if (num==0) {
			String re = "*";
			return re;
		}
		else{
			String t = printstarstring(num-1);
			return t+t;
		}
	}
}