/*
Write a program SentenceStatic.java that implements SentenceProblem in a static
context, i.e. convert each of your methods getBlankPositions(), countWords(),
and getWords() to static methods. Including main(), you should have a total of
four functions. Also, create a Scanner object to take in a sentence from the
user, either within main() or as an additional method. You also have the option
to include your print method in main() or as a separate method.

The main() method in Java is the entry point for the JVM (Java Virtual Machine)
into the Java program. JVM launches the java program by invoking the main()
method. The role of adding static before any entity is to make that entity a
class entity. Static methods and variables are class methods and class variables,
as opposed to instance methods and instance variables. Static methods and
variables can be accessed directly with no need to explicitly create objects.

static void func() {}		// static function
static int var;				// static variable

Making the main() method static is mandatory.
*/
import java.io.*;
import java.util.*;

public class SentenceStaticBrucker {

	static String sentence;

	public static void main(String[] args) {

		// Get sentence from user
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sentence = console.nextLine();

		System.out.println(getBlankPositions());
		System.out.println(countWords());
		String[] wordArr = getWords();

		// print wordArr in the proper format
		System.out.print("{");
		for (int i =0 ; i < wordArr.length; i++) {
			System.out.print(wordArr[i]);
			if (i < wordArr.length - 1)	System.out.print(",");
		}
		System.out.println("}");
	}

	// return an ArrayList of integer positions containing a
	// blank in the sentence. If there are no blanks in the
	// sentence, returns an empty list.
	public static List<Integer> getBlankPositions() {
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

	public static int countWords() {
		return getBlankPositions().size() + 1;
	}

	public static String[] getWords() {
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