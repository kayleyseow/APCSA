//from 2014 APCS practice exam
/*
Consider the following partial declaration for a WordScrambler class. The constructor for theWordScrambler class takes an even-length array of String objects and initializes the instance variable scrambledWords.
a. 
Write the WordScrambler method recombine. This method returns a String created from its two String parameters as follows.
-take the first half of word1
-take the second half of word2
-concatenate the two halves and return the new string.
b. 
Write the WordScrambler method mixedWords. This method creates and returns a new array of String objects as follows.

It takes the first pair of strings in words and combines them to produce a pair of strings to be included in the array returned by the method. If this pair of strings consists of w1 and w2, the method should include the result of calling recombine with w1 and w2 as arguments and should also include the result of calling recombine with w2 and w1 as arguments. The next two strings, if they exist, would form the next pair to be processed by this method. The method should continue until all the strings in words have been processed in this way and the new array has been filled. For example, if the array words contains the following elements:

{"apple", "pear", "this", "cat"}

then the call mixedWords(words) should return the following array.

{"apar", "peple", "that", "cis"}

In writing mixedWords, you may call recombine. Assume that recombine works as specified, regardless of what you wrote in part (a).
*/
public class WordScrambler{
	private String[] scrambledWords;
	public WordScrambler(String[] wordArr){
		scrambledWords = mixedWords(wordArr);
	}
	private String recombine(String word1,String word2){
		return word1.substring(0,word1.length()/2)+word2.substring(word2.length()/2,word2.length());
	}
	private String[] mixedWords(String[] words){
		String[] returnwords = new String[words.length];
		for (int i=0;i<words.length;i+=2){
			returnwords[i] = recombine(words[i],words[i+1]);
			returnwords[i+1] = recombine(words[i+1],words[i]);
		}
		return returnwords;
	}
}
