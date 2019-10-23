import java.util.*; 
public class DiceSimulation{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("");
		System.out.print("Enter desired sum of two dice: ");
		long diesum= console.nextInt();
		System.out.print("Enter number of rolls: ");
		int rolls= console.nextInt();
		System.out.printf("probability: %.2f%n", prob(diesum,rolls));
	}
	public static double prob(long a, int b){
		int firstdie ;
		int seconddie ;
		int total ;
		int place = 0;
		for (int i = 0;i < b; i++) {
			firstdie = (int)(Math.random()*6)+1;
			seconddie = (int)(Math.random()*6)+1;
			total = firstdie + seconddie;
			if (total==a) {
				place = place + 1;	
			}
		}
		double probability = (int)place/(double)b;
		return probability;
	}
}