/*
  Create a program that takes a string of operations
  (+,-,*,/,^) and returns the mathematical result.
  Assume that all numbers are 1 digit, and ignore
  the order of operations, just evaluate from L to R.

  Examples:
  Input : 9*3+4/9
  Output: 3.44

  Input : 9*3^2/3*5
  Output: 1215.00
*/
import java.util.*; 
public class OneLineCalculator{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String numbers = console.next();
        int calclength = numbers.length();
        double result = ((int)numbers.charAt(0)-48);
        for (int i =0;i<((calclength-1)/2) ;i++) {
            if ((int)numbers.charAt(2*i+1)== 43) {
                result=result+((double)numbers.charAt(2*i+2)-48);
            } 
            else if ((double)numbers.charAt(2*i+1)== 47) {
                result=result/((double)numbers.charAt(2*i+2)-48);
            }
            else if ((double)numbers.charAt(2*i+1)== 42) {
                result=result*((double)numbers.charAt(2*i+2)-48);
            }
            else if ((double)numbers.charAt(2*i+1)== 45) {
                result=result-((double)numbers.charAt(2*i+2)-48);
            }
            else if ((double)numbers.charAt(2*i+1)== 94) {
                result=(double)Math.pow(result, ((int)numbers.charAt(2*i+2)-48));
            }
        }
        System.out.printf("%.2f%n",result);       
    }
}
