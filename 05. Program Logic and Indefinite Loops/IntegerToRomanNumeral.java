import java.util.*;
public class IntegerToRomanNumeral{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int startnumber= console.nextInt();
		int endnumber= console.nextInt();
		String result = "";
		for (int i = startnumber;i <= endnumber ; i++) {
			System.out.println (romannumeral(i));
		}
	}
	public static String romannumeral(int integer){
		String rnumeral = "";
		while (integer >= 1000) {
	        rnumeral += "M";
	        integer -= 1000;        
	    }
	    while (integer >= 900) {
	        rnumeral += "CM";
	        integer -= 900;
	    }
	    while (integer >= 500) {
	        rnumeral += "D";
	        integer -= 500;
	    }
	    while (integer >= 400) {
	        rnumeral += "CD";
	        integer -= 400;
	    }
		while (integer >= 100) {
			rnumeral += "C";
			integer -= 100;
	    }
	    while (integer >= 90) {
	        rnumeral += "XC";
	        integer -= 90;
	    }
	    while (integer >= 50) {
	        rnumeral += "L";
	        integer -= 50;
	    }
	    while (integer >= 40) {
	        rnumeral += "XL";
	        integer -= 40;
	    }
	    while (integer >= 10) {
	        rnumeral += "X";
	        integer -= 10;
	    }
	    while (integer >= 9) {
	        rnumeral += "IX";
	        integer -= 9;
	    }
		while (integer >= 5) {
		  rnumeral += "V";
		  integer -= 5;
		}
		while (integer >= 4) {
	        rnumeral += "IV";
	        integer -= 4;
	    }
	    while (integer >= 1) {
	        rnumeral += "I";
	        integer -= 1;
	    }
	    return rnumeral;
	}
}
