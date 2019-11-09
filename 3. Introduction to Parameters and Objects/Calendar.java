//Write a program that produces calendars as output. Your program should have a method that outputs a single 
//month’s calendar like the one below, given parameters to specify how many days are in the month and what the date 
//of the first Sunday is in that month. In the month shown below, these values are 31 and 6, respectively.
import java.util.*;
public class Calendar {
  public static void main(String args[]) {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter the number of days: ");
    int days = console.nextInt();
    System.out.println("Please enter the day of the first Sunday: ");
    int sunday = console.nextInt();
    System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    for (int i=1; i<=7; i++)
      System.out.print("+------");
    System.out.println("+");
    for (int i=1; i!=sunday; i=sunday) {
      for (int j=1; j<=8-sunday; j++)
        System.out.print("|      ");
      for (int j=1; j<sunday; j++)
        System.out.print("|   " + j + "  ");
      System.out.println("|");
    }
  int row = (days-sunday+1)/7;
    for (int i=0; i<row; i++) {
      for (int j=sunday+i*7; j<sunday+(i+1)*7; j++)
        System.out.format("|  %2d  ",j);
      System.out.println("|");
    }
    for (int i=row*7+sunday-1; i<days; i+=7) {
        for (int j=row*7+sunday; j<=days; j++)
          System.out.format("|  %2d  ",j);
        for (int j=days+1; j<(row+1)*7+sunday; j++)
          System.out.print("|      ");
        System.out.println("|");
    }
    for (int i=1; i<=7; i++)
      System.out.print("+------");
    System.out.println("+");
  }
}
