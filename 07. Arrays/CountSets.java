/*Write a program that takes in an integer array and prints out the number of "sets" 
it contains where a set is a group of adjacent integers that have the same value.
input:
6
1 1 1 2 3 3
output:
2
*/
import java.util.*;
public class CountSets{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numbersinarray = console.nextInt();
		int[] integerarray = new int[numbersinarray];
		for (int i = 0;i<numbersinarray ;i++ ) {
			integerarray[i]=console.nextInt();
		}
		int counter = 0;
		boolean samenumber = false;
		for (int i = 0;i<numbersinarray-1;i++ ) {
			if (integerarray[i]==integerarray[i+1]) {
				if (samenumber==false) {
					samenumber = true;
					counter++;
				}
			}
			else{
				samenumber=false;
			}
		}
		System.out.println(counter);
	}
}
