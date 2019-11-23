/*
Write a program PersonalityTest.java to process data for the Keirsey
Temperament Sorter.
Your input file, e.g. Personality.txt, must be stored in the same folder as
PersonalityTest.java. You will output to the console - as always follow the
output format exactly.
*/
import java.util.*;
import java.io.*;
public class PersonalityTestConsole{
  public static void main(String[] args) throws FileNotFoundException {// if the user inputs wrong/missing file, will give this message
      Scanner console = new Scanner(System.in);
      System.out.print("Input file name: ");
      String inputfilename = console.nextLine(); // Get the input file name from user
      File inputfile = new File(inputfilename);  // Open input file
      while (!inputfile.exists()) { //Check if the file is present
		     System.out.print("File not found. Try again: ");//error message
		     inputfilename = console.nextLine(); // Get the input file name from user
         inputfile = new File(inputfilename); 
		  }
      Scanner readinputfile = new Scanner(inputfile); //Now the file is present, using Scanner to open the file
      scanInputFileLine(readinputfile);
  }
  public static void scanInputFileLine(Scanner input) {
  String[] result = new String[2];
  boolean printinputfile = true;
    while (input.hasNextLine()) { // Check for last line in file
      String name = input.nextLine() + ":"; // Contain user name
      String inputdata = input.nextLine();  // Contain result
      inputdata = inputdata.toUpperCase();  // Convert to Upper case
      result = calculations(stringtochar(inputdata)); // Calcualte the result
    	System.out.print(name + "\n");
			System.out.print("    " + result[0] + "\n");
			System.out.print("    " + result[1] + "\n");
      if (input.hasNextLine()==true) {
        System.out.println("");
      printinputfile = false;
  }
  public static char[] stringtochar(String input){
  	char[] charstring = new char[70];
      for (int i = 0; i<70; i++){
        charstring[i] = input.charAt(i); //Copy char in string to char array
    	}
    	return charstring;
    }

}
