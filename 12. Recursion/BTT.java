/*
Write a program to find all the paths from the origin to a given point (x, y).
You may travel only one step at a time in the positive N, E, or NE direction.
To satisy the HG test cases, set up your recursion to explore in this order:
N first, then NE, and finally E. Report each path and the total number of paths.

Example

input:
1 2

output:
moves: N N E
moves: N NE
moves: N E N
moves: NE N
moves: E N N
Number of paths = 5

Note: The number of paths increases rapidly with distance from origin.  HyperGrade may
truncate (and fail the test case) for 4 4.
 */


import java.util.*;

public class BTT {

    public static int counter = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        explore(x, y, 0, 0, "");
        System.out.println("Number of paths = " + counter);


    }

    public static void explore(int targetX, int targetY, int currX, int currY, String path){
        if(currX == targetX && currY == targetY) {
            System.out.println("moves:" + path);
            counter++;
        }
        else if(currX <= targetX && currY <= targetY){
            explore(targetX, targetY, currX, currY + 1, path + " N");
            explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
            explore(targetX, targetY, currX + 1, currY, path + " E");
        }
    }

}

