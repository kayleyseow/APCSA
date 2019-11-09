import java.util.*;
public class evenSum{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("how many integers? ");
	    int numbers = console.nextInt();

	    int evenSum = 0;
	    int evenMax = 0;

	    for (int i = 0; i < numbers; i++) {
	        System.out.print("next integer? ");
	        int num = console.nextInt();
	        if (num % 2 == 0){
	            evenSum += num;
	            if (num > evenMax) {
	                evenMax = num;
	            }
	        }
	    }
	    System.out.println("even sum = " +evenSum);
	    System.out.println("even max = " +evenMax);
	}	
}

    