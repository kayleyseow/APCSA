//from 2017 APCS exam, Q1
/*
This question involves identifying and processing the digits of a non-negative integer. The declaration of the Digits class is shown below. You will write the constructor and one method for the Digits class.
a. 
Write the constructor for the Digits class. The constructor initializes and fills digitlist with the digits from the non-negative integer num. The elements in digitlist must be Integer objects representing single digits, and appear in the same order as the digits in num. Each of the following examples shows the declaration of a Digits object and the contents of digitlist as initialized by the constructor.
b. 
Write the Digits method isStrictlyIncreasing. The method returns true if the elements of digitlist appear in strictly increasing order; otherwise, it returns false. A list is considered strictly increasing if each element after the first is greater than (but not equal to) the preceding element.
*/
public class Digits{
	private ArrayList<Integer> digitList;
	public digits (int num){
		String snum= num+"";
		for (int i=0;i<snum.length();i++){
			digitList.add((Integer) Integer.parseInt(snum.charAt(i)+""));
		}
	}
	public boolean isStrictlyIncreasing(){
		for (int i=0;i<digitList.size()-1;i++){
			if (digitList.get(i)>digitList.get(i+1)) return false;
		}
		return true;
	}
}
