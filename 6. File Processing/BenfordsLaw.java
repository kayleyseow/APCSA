import java.util.*;
import java.io.*;
public class BenfordsLaw {
    public static void main(String[] args) throws FileNotFoundException {// if the user inputs wrong/missing file, will give this message
        Scanner console = new Scanner(System.in);
        System.out.println("Let us count those leading digits...");
        System.out.print("input file name? ");
        String filename = console.next();
        Scanner inputtedfilename = new Scanner(new File(filename)); // new scanner to accept the file name
        int[] digits = countingdigits(inputtedfilename);
        finalresult(digits);//prints out the final answer
    }

}
