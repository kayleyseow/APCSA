import java.util.Scanner;
public class UltraFactorial{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a natural number (non-negative integer): ");
		int number = console.nextInt();
		factorial(number);
	}
	public static void factorial(int x){
		long fa = 1;
		long superfactorial = 1;
		long ultrafactorial=1;
		for (int i = 1; i<x; i++){
			fa *= (i+1);
			fa%=179424691;
			superfactorial*=fa;
			superfactorial%=179424691;
			ultrafactorial*= superfactorial;
			ultrafactorial%=179424691;
		}
		System.out.println("factorial       " +fa);
		System.out.println("superfactorial: "+superfactorial);
		System.out.println("ultrafactorial: "+ ultrafactorial);
	}
}
