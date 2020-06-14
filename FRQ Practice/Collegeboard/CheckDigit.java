//from the 2020 exam sample questions, Q2 (Methods and Control Structures)
public class CheckDigit{
	/** Returns the check digit for num
 	* Precondition: The number of digits in num is between one and six, inclusive.
 	* num >= 0
 	*/
 	public static int getCheck(int num){
 		/* implementation not shown */
 	}
 	/** Returns true if numWithCheckDigit is valid, or false otherwise,
 	* as described in part (a)
 	* Precondition: The number of digits in numWithCheckDigit is
 	* between two and seven, inclusive.
 	* numWithCheckDigit >= 0
 	*/
 	public static boolean isValid(int numWithCheckDigit){
 		if (!(numWithCheckDigit>=2&&numWithCheckDigit<=7)) return false;
 		int withoutcheckdigit = numWithCheckDigit/10;
 		int checkdigit = getCheck(withoutcheckdigit);
 		return checkdigit = numWithCheckDigit%10;
 	}
 	/*
 	I would include a new private static int to the class CheckDigit, which I 
	would name incorrectCheckDigit, which I would use in the isValid method. 
	Before returning the boolean, if the boolean which is to be returned is 
	false, then I would increment incorrectCheckDigit by one and then return the
	boolean false. I would also need to create a getincorrectCheckDigit method 
	in order to return incorrectCheckDigit so it can be accessed outside class.
 	*/
}
