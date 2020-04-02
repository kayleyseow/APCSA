//calculated square root curve for given grade
import java.util.Scanner;
public class SquareRootCurve {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is the score? ");
        double y = console.nextDouble();
        double x = y;
        for(double i = 1; i <= 1000000; i++) {
            y = ((y + x/y)/2);
        }
        double grade = y * 10 + 0.5;
        System.out.print("square root score: ");
        String lgrade = "";
        if (grade > 97) {
             lgrade = "A+";
        }
        else if (grade > 93) {
            lgrade = "A";
        }
        else if (grade > 90) {
            lgrade = "A-";
        }
        else if (grade > 87) {
            lgrade = "B+";
        }
        else if (grade > 83) {
            lgrade = "B";
        }
        else if (grade > 80) {
            lgrade = "B-";
        }
        else if (grade > 77) {
            lgrade = "C+";
        }
        else if (grade > 73) {
            lgrade = "C";
        }
        else if (grade > 70) {
            lgrade = "C-";
        }
        else if (grade > 67) {
            lgrade = "D+";
        }
        else if (grade > 63) {
            lgrade = "D";
        }
        else if (grade > 60) {
            lgrade = "D-";
        }
        else if (grade < 59) {
            lgrade = "F";
        }
        System.out.println((int) grade);
        System.out.println("Letter grade: " + lgrade);
    }
}
