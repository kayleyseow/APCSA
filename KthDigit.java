import java.util.*;

public class KthDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//set the ints
		System.out.println("Please enter number");
        int x = sc.nextInt();
        System.out.println("Please enter integer needed");
        int y = sc.nextInt();

       for(int i = 0; i < y; i++) {
           x = x/10;
       }
       //println remainder
       System.out.println(x%10);
	}
}