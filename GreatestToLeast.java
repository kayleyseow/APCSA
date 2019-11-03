//Write a program that takes three integers as user input and prints the numbers in order from greatest to least.
import java.util.*;
public class GreatestToLeast{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();
		if (a>b) {
			if(a>c){
				if (b>c) {
					System.out.println(a+" "+b+" "+c);
				}
				else{
					System.out.println(a+" "+c+" "+b);
				}
			}
			else{
				System.out.println(c+" "+a+" "+b);
			}
		}
		else{
			if (a>c) {
				System.out.println(b+" "+a+" "+c);	
			}
			else{
				if (b>c) {
					System.out.println(b+" "+c+" "+a);
				}
				else{
					System.out.println(c+" "+b+" "+a);
				}
			}
		}
	}
}
