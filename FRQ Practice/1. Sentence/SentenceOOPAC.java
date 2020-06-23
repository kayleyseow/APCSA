import java.util.Scanner;

public class SentenceOOPAC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter sentence: ");
		SentenceOOPClientAC s = new SentenceOOPClientAC(input.nextLine());
		System.out.println(s.getBlankPositions());
		System.out.println(s.countWords());
		System.out.println(s.print(s.getWords()));
	}
}