import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class PersonalityTestFile{
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
		  System.out.print("Output file name: ");// asks user for the name of the output file
		  String outputfilename = console.nextLine();
  	  scanInputFileLine(readinputfile, outputfilename);
  }
    public static void scanInputFileLine(Scanner input, String output) {
  String[] result = new String[2];
  boolean printinputfile = true;
  // Open output file and write the result       
  try(FileWriter fileWriter = new FileWriter(output)) {
    while (input.hasNextLine()) { // Check for last line in file
      //System.out.println(input.nextLine()+ ":"); // Print out name
      String name = input.nextLine() + ":"; // Contain user name
      String inputdata = input.nextLine();  // Contain result
      inputdata = inputdata.toUpperCase();  // Convert to Upper case
      result = calculations(stringtochar(inputdata)); // Calcualte the result
      if (printinputfile == true){
        fileWriter.write("Input file name: " + name + "\n");
      } else{
    	  fileWriter.write(name + "\n");
      }
			fileWriter.write("    " + result[0] + "\n");
			fileWriter.write("    " + result[1] + "\n\n");
      printinputfile = false;
      }
		} catch (Exception e) {
			e.printStackTrace();
	  }
  }

}
