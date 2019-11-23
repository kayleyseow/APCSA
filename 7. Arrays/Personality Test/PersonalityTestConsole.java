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
  public static String[] calculations(char[] data){
    int[] aCount = new int[4];
  	int[] bCount = new int[4];
    int[] bPercent = new int[4];
  	String[] type = new String[4];
    String[] result = new String[2];
    //Calculate the personality
    for(int i = 0; i < 70; i++){
    	if(data[i] == 'A'){ 
        if (i % 7 == 0) { //Extrovert
          aCount[0]++; 
        }
        if (i % 7 == 1 || i % 7 == 2){ //Sensing
          aCount[1]++;
        }
        if (i % 7 == 3 || i % 7 == 4){ //Thinking
          aCount[2]++;
        }
        if (i % 7 == 5 || i % 7 == 6){ //Judging
          aCount[3]++;
        }
    	} 
      else if (data[i] == 'B'){
         if (i % 7 == 0) { //Introvert
           bCount[0]++; 
         }
         if (i % 7 == 1 || i % 7 == 2){ //iNtuition
           bCount[1]++;
         }
         if (i % 7 == 3 || i % 7 == 4){ //Feeling
           bCount[2]++;
         }
         if (i % 7 == 5 || i % 7 == 6){ //Perceiving
           bCount[3]++;
         }
    		}
    } 
    for (int i = 0; i < 4; i++){ //Calculate the percentage for B and the type
      double k = (double)(bCount[i] * 100) / (double)(aCount[i]+bCount[i]);
      bPercent[i] = (int) Math.round(k); //Calculate Percentage of B
      if(bPercent[i] < 50){
        if(i == 0){
          type[i] = "E"; // Extrovert
        } else if (i == 1){
          type[i] = "S"; // Sensing
        } else if (i == 2){
          type[i] = "T"; //Thinking
        } else {
          type[i] = "J"; //Judging
        }
      } 
      else if (bPercent[i] > 50){
        if(i == 0){
          type[i] = "I"; // Introvert
        } else if (i == 1){
          type[i] = "N"; // iNtuition
        } else if (i == 2){
          type[i] = "F"; // Feeling
        } else {
          type[i] = "P"; // Perceiving
        }      
      } 
      else {
        type[i] = "X";
      }
    }
    result[0] = aCount[0] + "A-" + bCount[0] + "B " + aCount[1] + "A-" + bCount[1] + "B " + aCount[2] + "A-" + bCount[2] + "B " + aCount[3] + "A-" + bCount[3] + "B";
    result[1] = "[" + bPercent[0] + "%, " + bPercent[1] + "%, " + bPercent[2] + "%, " + bPercent[3] + "%] = " + type[0] + type[1] + type[2] + type[3];
    return (result);
  }
}
