import java.util.*;
public class WriteBinaryString{
	public static void main(String[] args) {
		Scanner console  = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = console.nextInt();
		System.out.println("Binary expression: " + binary(integer));
	}
	public static String binary(int n) {
		if (n == 0) return "0";
		if (n == 1) return "1";
		if (n<0){
			return "-" + binary(-1 * n);
		}
		else{
			return binary(n / 2) + (n % 2);
		}
		//return (n < 0 ? "-" + binary(-1 * n) : binary(n / 2) + (n % 2));
	}
}