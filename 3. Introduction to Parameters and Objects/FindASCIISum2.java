import java.util.*;
public class FindASCIISum2{
	public static void main(String[] args) {
     	Scanner console = new Scanner(System.in);
		int numberOfString = console.nextInt();
		String userString = console.nextLine();
        int stringsum = 0;
        for(int i = 0; i < numberOfString; i++){
			userString = console.nextLine();
			stringsum = stringsum + asciisum(userString);
		}
		System.out.println(stringsum);  
	}
	public static int asciisum(String inputstring){ //int returns an integer value 
		int cal = 0;
	    for (int i = 0; i < inputstring.length(); i++){// length is stored as an integer hence its place in the forloop
	    	cal = cal + (int) inputstring.charAt(i);
	    }
		return cal;
	}
}