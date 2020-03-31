//calculates the result of the base and the power without using Math.pow
import java.util.*;
public class MathPower{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your base: ");
		int input1 = console.nextInt();
		System.out.print("Please enter your power: ");
		int input2 = console.nextInt();
		
		System.out.println("Base is: "+ input1);
		System.out.println("Power is:"+ input2);
		System.out.println("Result is:"+ power(input1, input2));
	}	
	public static int multiply(int a, int b){
		int total = 0;
		for(int i = 0; i < b; i++){
			for(int j = 0; j < a; j++){
				total++;
			}
		}
		return total;
	}
	public static int power(int base, int power){
		int answer = base;
		if (power < 1){
			answer = 1;
			return answer;
		}
		for (int i=0;i < (power-1) ; i++) {
			answer = multiply(answer, base);
		}
		return answer;
	}	
}
