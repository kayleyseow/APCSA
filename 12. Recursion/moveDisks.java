/*
Write a program using recursion to move n disks from a source post to a destination
post using a third post for temporary storage. The disks are initially stacked on 
the source post with the largest disk on the bottom, progressively smaller disks above,
and the smallest disk on top.
Only one disk at a time can be moved, and a larger disk can never be placed on a
smaller disk.
The source post will always be post A. The destination post can be either post B or
post C, specified by the user.

Input:  The number of disks to be moved and the destination post, B or C (upper case
only).
Output:  A series of moves that will move the disks from post A to post B in the
least possible number of moves, and the total number of moves required.

Example:
Enter number of disks: 3
Enter destination post: B
Moves:
A -> B
A -> C
B -> C
A -> B
C -> A
C -> B
A -> B
Number of moves: 7
*/
import java.util.*;
public class moveDisks{
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
