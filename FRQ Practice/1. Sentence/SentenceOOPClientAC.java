//Albert's solution to SentenceOOP
import java.util.*;

public class SentenceOOPClientAC {
	private String sentence;
	
	public SentenceOOPClientAC (String s) {
		sentence = s;
	}

	public List<Integer> getBlankPositions() { 
		List<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < sentence.length(); i++) if (sentence.charAt(i) == '\u0020') alist.add(i);
		return alist;
	}

	public int countWords() {
		return sentence.split(" ").length;
	}
	
	public String[] getWords() {
		return sentence.split(" ");
	}

	public String print(String[] a) {
		String s = "{";
		for (int i = 0; i < a.length-1; i++) s += a[i] + ", ";
		return s + a[a.length-1] + "}";
	}

	
}
