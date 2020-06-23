import java.util.*;
public class SentenceOOP{
	private String sentence;
	public SentenceOOP (String s){
		sentence = s;
	}
	public ArrayList<Integer> getBlankPositions(){
	    ArrayList<Integer> alist = new ArrayList<Integer>();
	    for (int i=0;i<sentence.length();i++) if (sentence.substring(i,i+1).equals(" ")) alist.add(i);
	    return alist;
	}
	public int countWords(){
	    return getBlankPositions().size()+1;
	}
	public String[] getWords(){
	    String[] words = sentence.split(" ");
	    return words;
	}
	public String printarray(String[] array){
		String printedsentence = "";
		printedsentence+="{";
		for (int i=0;i<array.length ;i++ ) {
		    printedsentence+=(array[i]);
		    if (array.length>1&&i<array.length-1) printedsentence+=", ";
		}
		printedsentence+="}";
		return printedsentence;
	}
}