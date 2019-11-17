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
    //method for the sum 
    public static int sum(int[] number) {
        int sum = 0;
        for (int i: number) {//compares the value
            sum =sum + i;
        }
        return sum;//returns something because is not void
    }
    //method to count the digits
    public static int[] countingdigits(Scanner filen) {
        int[] cn = new int[10];
        while (filen.hasNext()) {
            int the1stdigitof = firstdigitof(filen.next());
            cn[firstdigit(the1stdigitof)]++;
        }
        return cn;
    }
    //method for the first digit of the number
    public static int firstdigitof(String digit) {
        for (char ch : digit.toCharArray()) {
            if (ch>='1'&& ch <='9') {
                return ch - '0';
            }
        }
        return 0;
    }

}
