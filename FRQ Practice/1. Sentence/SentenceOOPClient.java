import java.util.*;
public class SentenceOOPClient{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("enter sentence: ");
		SentenceOOP sentence = new SentenceOOP(console.nextLine());
		System.out.println(sentence.getBlankPositions()+"\n"+sentence.countWords());
		System.out.println(sentence.printarray(sentence.getWords()));
	}
}