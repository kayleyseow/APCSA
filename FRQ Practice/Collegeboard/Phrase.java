//from 2017 APCS exam, Q3
/*
This question involves analyzing and modifying a string. The following Phrase class maintains a phrase in an instance variable and has methods that access and make changes to the phrase. You will write two methods of the Phrase class. 
a.
Write the Phrase method replaceNthOccurrence, which will replace the nth occurrence of the string str witht he string repl. If the nth occurrence does not exist, currentPhrase remains unchanged.
b. 
Write the Phrase method findLastOccurence. THis method finds and returns the index of the last occurrence of a given string in currentPhrase. If the given string is not found, -1 is returned. 
*/
public class Phrase{
	private Stirng currentPhrase;
	/**Constructs a new Phrase object.*/
	public Phrase(String p){
		currentPhrase = p;
	}
	  /** Retuns the index of the nth occurrence of str in the current phrase;
  	* returns -1 if the nth occurrence does not exist.
  	* Precondition: str.length() > 0 and n > 0
		* Postcondition: the current phrase is not modified.
		*/
  public int findNthOccurrence(String str, int n){
    /*implementation not shown*/
  }
  /** Modifies the current phrase by replacing the nth occurrence of str with repl.
  * If the nth occurrence does not exist, the current phrase is unchanged.
  * Precondition: str.length() > 0 and N > 0
  */
	public void replaceNthOccurrence(String str, int n, String repl){
		int index = findNthOccurrence(str, n);
		if (index>-1){
			String beginning = currentPhrase.substring(0,index);
			String end = currentPhrase.substring(index+str.length(),currentPhrase.length());
			currentPhrase = beginning+repl+end;
		}
	}
  /** Returns the index of the last occurrence of str in the current phrase;
  * returns -1 if str is not found.
  * Precondition: str.length() > 0
  * Postcondition: the current phrase is not modified.
  */
	public int findLastOccurence (String str){
		int i = 0;
		while (findNthOccurrence(str,i+1)!=-1){
			i++;
		}
		return findNthOccurrence(str,n);
	}
	public String toString(){
		return currentPhrase;
	}
}
