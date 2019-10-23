import java.util.*;
public class CollatzSequence {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of terms followed by terms: ");
		int terms= console.nextInt();
		int biggest = 0;
		for (int i = 0;i<terms;i++ ) {
			int term= console.nextInt();
			int termresult = (collatz(term));
			if (termresult > biggest) {
				biggest = termresult;
			}
			System.out.println (collatz(term));
		}
		System.out.println ("Longest: " + biggest);

	}
	public static int collatz(int x){
		int y = 1;
		while (x != 1){
			if (x%2==1) {
				x=3*x+1;
				y++;
			}
			else {
				x=x/2;
				y++;
			}
			//System.out.println (x);
		}
		return y++;
	}
}
