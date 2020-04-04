/*Write a program that reads the console for a string and outputs the string with two periods between each letter. Try to make it as efficient as possible.
Sample Input: 
fencepost

Sample Output:
f..e..n..c..e..p..o..s..t
*/
import java.util.*; 
public class Fencepost{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String word = console.next();
		String printword = "";
        for (int i = 0; i < word.length() - 1; i++) {
            printword = printword + word.charAt(i) + "..";
        }
        printword =printword + word.charAt(word.length()-1);
        System.out.print(printword + "\n");
	}
}
