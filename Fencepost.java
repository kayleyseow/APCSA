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