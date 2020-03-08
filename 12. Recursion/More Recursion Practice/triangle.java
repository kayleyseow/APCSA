/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 
blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or 
multiplication) the total number of blocks in such a triangle with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/
import java.util.*;
public class triangle{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number : ");
		System.out.println(triangle(console.nextInt()));
	}
	public static int triangle(int rows) {
		if(rows<=1) return rows;
	    return rows+triangle(rows-1);
	}
}