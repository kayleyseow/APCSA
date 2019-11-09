/*
For computer operations that take more than about seven seconds, such as large downloads or calculations
in probability statistics, it is considered proper etiquette to provide a human user with feedback as to
how things are progressing. For example, we are all familiar with the scrolling "time remaining" bar when
updating, say, an operating system (the thought of which always makes me cringe!).
Assume you are running a program with an iterative loop that will cycle N times, where N can be a large
number. Take in N from the user. Assume, for the time being, that N is a multiple of 10, and is at most
10,000,000 (to avoid timing out in HyperGrade). Write a program that outputs 10 equally spaced counter
updates to indicate progress.

Examples of input/output:

1.
number of trials: 10

finished trial number: 
                       1
                       2
                       3
                       4
                       5
                       6
                       7
                       8
                       9
                       10

2.
number of trials: 300000

finished trial number: 
                       30000
                       60000
                       90000
                       120000
                       150000
                       180000
                       210000
                       240000
                       270000
                       300000

3.
number of trials: 777000

finished trial number: 
                       77700
                       155400
                       233100
                       310800
                       388500
                       466200
                       543900
                       621600
                       699300
                       777000
*/
import java.util.*;
public class UserFeedback10{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("number of trials: ");
		int trials = console.nextInt();
		System.out.println("finished trial number: ");
		int number = trials/10;
		int numberprint = 0;
		for (int i = 0;i < 10 ;i++ ) {
			numberprint = numberprint + number;	
			System.out.println("                       "+numberprint);		
		}
	}
}
