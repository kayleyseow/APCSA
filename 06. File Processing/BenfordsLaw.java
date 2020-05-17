/*
Write a program that finds the distribution of leading digits in a
set of positive integers. Your program will be useful for exploring
the phenomenon known as Benford's Law.  See Piazza for the complete
problem description.
Here is one example of console input/output [The apostrophe in "Let's"  is problematic with HyperGrade.  That is way "Let us" in used instead]:
Let us count those leading digits...
input file name? 4BenfordLinear.txt
Digit Count Percent
    1     5  11.11
    2     5  11.11
    3     5  11.11
    4     5  11.11
    5     5  11.11
    6     5  11.11
    7     5  11.11
    8     5  11.11
    9     5  11.11
Total    45 100.00
*/
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
    //method to find the first digit of the number
    public static int firstdigit(int n) {
        int result = Math.abs(n);
        while (result >= 10) {
            result = result / 10;//logic: divide everything by ten and when the while loop is going on, you will find the first digit
        }
        return result;//returns because not void
    }
    //method to print out the final things 
    public static void finalresult(int[] number) {
        if (number[0] > 0) { // just in case there r zeroes
            System.out.println("excluding "+ number[0] +  " zeros");
        }
        int total = sum(number ) - number[0];
        System.out.println("Digit Count Percent"); //format the top line
        for (int i = 1; i < number.length; i++) { //sets up the forloop
            double percent = number[i] *100.0  / total; //prints out the percent 
            System.out.printf("%5d %5d %6.2f\n", i, number[i], percent); //print f to format the placement of the numbers and the decimals
        }
        System.out.printf("Total %5d %6.2f\n", total, 100.0);//print f for formatting, includes the total
    }
}
