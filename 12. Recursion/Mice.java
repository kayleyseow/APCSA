/*
One day, you're walking around the MSJ math department carrying a list of a several integers when suddenly 
you find yourself being chased by 1<=n<=1000 small mice, each of whom has stolen somebody's math homework 
with a few numbers scribbled on it. The mice threaten to chase you into B-pi, but you can fend them off one
by one on certain conditions:

If each of the numbers on a given mouse's stolen homework appears in the same order, but not necessarily
adjacently in your list, you will be able to get away from that mouse. Otherwise ... well, we can figure that
out later. So for example, if your paper reads "4 5 8 3 2 1" and a certain mouse has "5 2", you will be able
to get away from that one, because you have 5 at index 1 and 2 at index 4. Note that if that mouse had "2 5",
you wouldn't be able to get away, as they would be in the wrong order.

The input format is as follows:
First, the number of integers in your list will be given. (line 1)
Each of the integers in your list, space-separated. (line 2)
The number of mice (1<=n<=1000) (line 3)
Each mouse has two lines of input (lines 4 through 2n+3): the integer size of the number of integers on its
stolen homework, each integer on the homework, space separated.

Write a program that will determine how many of the mice you will be able to get away from. Once you fail to 
get away from one, the ones that come after don't count. Assume the all numbers on any given homework are
distinct, and that all mice numbers appear in your numbers.

Example input:
7		       //number of numbers
1 4 2 6 3 8 9	       //numbers in my array
3		       //number of mice
2 		       //number of numbers
1 2 		       //numbers in first mouse array
4 		       //number of numbers
1 6 8 9		       //numbers in second mouse array
3 		       //number of numbers
2 1 4 		       //numbers in third mouse array

Output:
2 		       //number of mice I got away from

Explanation: You can get away from the first two mice but not the third (wrong order)
*/
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
