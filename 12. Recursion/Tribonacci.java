import java.util.*;
public class Tribonacci{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number : ");
		System.out.println(tribonacci(console.nextInt()));
	}
	public static int tribonacci(int num){
		if (num==0) return 0;
		if (num==1) return 1;
		if (num==2) return 1;
		return tribonacci (num-3)+tribonacci(num-2)+tribonacci(num-1);
	}
}