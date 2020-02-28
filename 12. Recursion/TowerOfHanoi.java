/* 
Write a recursive program to solve the Towers of Hanoi puzzle. The puzzle involves manipulating disks that you can 
move between three different towers. You are given a certain number of disks (four in this example) stacked on one
of the three towers. The disks have decreasing diameters, with the smallest disk on the top.

The object of the puzzle is to move all of the disks from one tower to another (say, from A to B). The third tower is 
provided as a temporary storage space as you move disks around. You are allowed to move only one disk at a time, 
and you are not allowed to place a disk on top of a smaller one (i.e., one with a smaller diameter).

Examine the rather simple solutions for one, two, and three disks, and see if you can discern a pattern. Then write a 
program that will solve the Towers of Hanoi puzzle for any number of disks. (Hint: Moving four disks is a lot like 
moving three disks, except that one additional disk is on the bottom.)
Equation for the number of moves for n disk(s) = 2^n-1
*/
import java.util.*;
public class TowerOfHanoiakamoveDisks{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of disks: Enter destination post: Moves:\n");
		int disks = console.nextInt();
		char destpost = console.next().charAt(0);
		char temppost;
		if (destpost=='B') {
			temppost = 'C';
		}
		else temppost = 'B';
		moveDisks(disks, 'A', destpost, temppost, 0);
		System.out.println("Number of moves: "+numberofmoves(disks));
		
	}
	public static void moveDisks(int n, char sourcerod, char destinationrod, char temporaryrod, int counter) { 
		if (n == 1) { 
			System.out.println(sourcerod + " -> " + destinationrod); 
			return; 
		} 
		else{
			moveDisks(n-1, sourcerod, temporaryrod, destinationrod, counter++);
			System.out.println(sourcerod + " -> " + destinationrod); 
			moveDisks(n-1, temporaryrod, destinationrod, sourcerod, counter++); 
		}
	} 
	public static int numberofmoves(int n) {
	    if (n == 0) return 0;
	    return 2 * numberofmoves(n - 1) + 1;
	}
}
