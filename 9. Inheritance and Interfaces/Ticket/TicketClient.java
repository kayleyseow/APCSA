/*
Client program to exercise your Ticket class
*/
import java.util.*;

public class TicketClient{
	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		int num1 = getNumber("Enter ticket number : ", console);
		WalkupTicket wt1 = new WalkupTicket(num1);
//		System.out.println("Walkup ticket number " + num1 + ": $" + wt1.getPrice());
		System.out.println(wt1);
		System.out.println();

		int num2a = getNumber("Advance ticket ticket number : ", console);
		int num2b = getNumber("Days in advance : ", console);
		AdvanceTicket at1 = new AdvanceTicket(num2a, num2b);
//		System.out.println("Advance ticket number " + num2a + ": $" + at1.getPrice());
		System.out.println(at1);
		System.out.println();

		int num3a = getNumber("Student advance ticket ticket number : ", console);
		int num3b = getNumber("Days in advance : ", console);
		StudentAdvanceTicket sat1 = new StudentAdvanceTicket(num3a, num3b);
//		System.out.println("Student advance ticket number " + num3a + ": $" + sat1.getPrice());
		System.out.println(sat1);
		System.out.println();
	}
	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}
}
