//albert's code to find binary numbers
import java.util.Scanner;
public class BinaryTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: " + bin(input.nextInt()));
	}
	public static String bin(int n) {
		if (n == 0) return "0";
		if (n == 1) return "1";
		//essentially the line below is if n<0 is true then ["-" + bin(-1 * n)] if n<0 is false then [bin(n / 2) + (n % 2))]
		return (n < 0 ? "-" + bin(-1 * n) : bin(n / 2) + (n % 2));
	}
}
