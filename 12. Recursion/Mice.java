import java.util.*;
public class Mice {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numberofnumbersinarray = console.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < numberofnumbersinarray; i++) {
			array.add(console.nextInt());
		}
		int mice = console.nextInt();
		int numberofmiceescapedfrom = 0;
		for (int i = 0; i < mice; i++) {
			int numbersinmice = console.nextInt();
			int[] numbersinamouse = new int[numbersinmice];
			for (int j = 0; j < numbersinmice; j++) {
				numbersinamouse[j] = console.nextInt();
			}
			int[] arrayposition = new int[numbersinmice];
			for (int j = 0; j < numbersinmice; j++) {
				arrayposition[j] = array.indexOf(numbersinamouse[j]);
			}
			boolean tf = true;
			for (int z = 0; z < arrayposition.length - 1; z++) {
				if (arrayposition[0] == -1) {
					tf = false;
				}
				if (arrayposition[z] > arrayposition[z + 1]) {
					tf = false;
					break;
				}
			}
			if (arrayposition[0] < 0) {
				tf = false;
			}
			if (tf == true) {
				numberofmiceescapedfrom++;
			}
		}
		System.out.println(numberofmiceescapedfrom);
	}

}
