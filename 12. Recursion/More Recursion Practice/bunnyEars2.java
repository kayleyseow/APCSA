/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the 
normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a 
raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without 
loops or multiplication).
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/
import java.util.*;
public class bunnyEars2{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of bunnies: ");
		int number = console.nextInt();
		System.out.println(bunnyEars(number) + " ear(s)");
	}
	public static int bunnyEars(int num){
		if (num==0) {
			return 0;
		}
		else{
			if (num%2==1) {
				return 2+bunnyEars(num-1);

			}
			return 3+bunnyEars(num-1);
		}
	}
}