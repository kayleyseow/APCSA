//from 2018 APCS exam, Q2
/*
This question involves reasoning about pairs of words that are represented by the following WordPair class.
a. 
Write the constructor for the WordPairList class. The constructor takes an array of strings words as a parameter and initializes the instance variable allPairs to an ArrayList of WordPair objects. A WordPair object consists of a word from the array paired with a word that appears later in the array. The allPairs list contains WordPair objects (words[i], words[j]) for every i and j, where 0 ≤ i < j < words.length . Each WordPair object is added exactly once to the list. The following examples illustrate two different WordPairList objects.
b. 
Write the WordPairList method numMatches. This method returns the number of WordPair objects in allPairs for which the two strings match.
*/
public class WordPairList{
	private ArrayList <WordPair> allPairs;
	public WordPairList(String[] words){
		for (int i=0;i<words.length ;i++ ) {
			for (int j=i+1;j<words.length ;j++ ) {
				allPairs.add(new WordPair(words[i],words[j]));
			}
		}
	}
	public int numMatches(){
		int count = 0;
		for (int i=0;i<allPairs.size() ;i++ ) {
			if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) count++;
		}
		return count;
	}
}
