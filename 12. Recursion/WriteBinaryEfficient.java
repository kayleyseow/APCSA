//efficient code to find binary numbers
//albert's code
import java.util.Scanner;
public class BinaryTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: " + bin(input.nextInt()));
	}
	public static String bin(int n) {
		if (n == 0) return "0";
		if (n == 1) return "1";
		return (n < 0 ? "-" + bin(-1 * n) : bin(n / 2) + (n % 2));
	}
}
