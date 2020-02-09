import java.util.*;

public class Chapter10Review{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		String input = console.nextLine();
		String[] inputs = input.split(" ");

		int l = Integer.valueOf(inputs[0]);	// add a legume every M month div by L
		int c = Integer.valueOf(inputs[1]);	// add a corn every M month divisible by c
		int r = Integer.valueOf(inputs[2]);	// add a rice every M month div by R
		int k = Integer.valueOf(inputs[3]);	// start on a new row every M month div by K
		int months = Integer.valueOf(inputs[4]);	// num of months

		ArrayList<ArrayList<String>> periodList = new ArrayList<ArrayList<String>>();
		ArrayList<String> period = new ArrayList<String>();
		periodList.add(period);
		for (int month = 1; month <= months; month++){
			if (month%k == 0){	// period has ended or reached the end of months
				period = new ArrayList<String>();
				periodList.add(period);
			}
			if (month%l == 0){
				period.add("L");	
			}
			if (month%c == 0){
				period.add("C");
			}
			if (month%r == 0){
				period.add("R");
			}			
			System.out.print(month);
			for (int p = 0; p < periodList.size(); p++){
				System.out.println(periodList.get(p).toString());
			
			}
		}

	}
}