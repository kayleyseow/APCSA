//Albert's solution to SentenceStatic
import java.util.*;

public class SentenceStaticAC {
	private static String sentence;
	
	public SentenceStaticAC (String s) {
		sentence = s;
	}

	public static List<Integer> getBlankPositions() { 
		List<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < sentence.length(); i++) if (sentence.charAt(i) == '\u0020') alist.add(i);
		return alist;
	}

	public static int countWords() {
		return sentence.split(" ").length;
	}
	
	public static String[] getWords() {
		return sentence.split(" ");
	}

	public static String print(String[] a) {
		String s = "{";
		for (int i = 0; i < a.length-1; i++) s += a[i] + ", ";
		return s + a[a.length-1] + "}";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		SentenceStaticAC s = new SentenceStaticAC(input.nextLine());
		System.out.println(s.getBlankPositions());
		System.out.println(s.countWords());
		System.out.println(s.print(s.getWords()));
	}
}