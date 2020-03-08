/*
We have a number of bunnies and each bunny has two big floppy ears. We want to 
compute the total number of ears across all the bunnies recursively (without loops or 
multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/
import java.util.*;
public class bunnyEars{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of bunnies: ");
		int number = console.nextInt();
		System.out.println(bunnyEars(number) + " ear(s)");
	}
	public static int bunnyEars(int num){
		if (num==0) return 0;
		return 2+bunnyEars(num-1);
	}
}