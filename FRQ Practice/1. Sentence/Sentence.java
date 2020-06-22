import java.util.*;

public class Sentence {

	// The sentence to manipulate
	private String sentence = "The cat sat on the mat.";

	public static void main(String[] args) {
		System.out.println(getBlankPositions());
		System.out.println(countWords());
		System.out.println(getWords());
	}

	// return an ArrayList of integer positions containing a
	// blank in this sentence. If there are no blanks in the
	// sentence, returns an empty list.
	public List<Integer> getBlankPositions() {
		List<Integer> posList = new ArrayList<Integer>();
		for (int i = 0; i < sentence.length(); i++) {
		if (sentence.substring(i, i + 1).equals(" ")) posList.add(i);
		}
		return posList;
	}

	/*
	// Alternatively (an inferior, unnecessarily complicated solution!)
	public List<Integer> getBlankPositions() {
		List<Integer> posList = new ArrayList<Integer>();
		String s = sentence;
		int diff = 0;
		int index = s.indexOf(" ");
		while (index >= 0) {
			posList.add(index + diff);
			diff = sentence.length() - (s.substring(index + 1)).length();
			s = s.substring(index + 1);
			index = s.indexOf(" ");
		}
		return posList;
	}
	*/

	public int countWords() {
		return getBlankPositions().size() + 1;
	}

	public String[] getWords() {
		List<Integer> posList = getBlankPositions();
		int numWords = countWords();
		String[] wordArr = new String[numWords];
		for (int i = 0; i < numWords; i++) {
			if (i == 0) {
				if (posList.size() != 0)
					wordArr[i] = sentence.substring(0, posList.get(0));
				else
					wordArr[i] = sentence;
			}
				else if (i == posList.size())
					wordArr[i] = sentence.substring(posList.get(i - 1));
				else
					wordArr[i] = sentence.substring(posList.get(i - 1), posList.get(i));
		}
		return wordArr;
	}
}
