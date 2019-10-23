import java.util.*; 
public class GreatestFactor{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int integer = console.nextInt();
		int factor = 0;
		for (int i = 1; i <integer;i++ ) {
			if (integer%i==0) {
				factor = i;
			}
		}
		System.out.println(factor);
	}
}