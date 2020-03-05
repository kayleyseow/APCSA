/*
Write a recursive program called waysToClimb that takes a positive integer representing
a number of stairs and prints (i) each unique way to climb a staircase of that height,
taking strides of one or two stairs at a time, and (ii) the total number of ways.  Do
not use any loops.  Output each way to climb on its own line, using a 1 to indicate a
small stride of 1 stair, and a 2 two indicate a large stride of 2 stairs.
The order in which you report each way to climb is important. Design your recursive
method to produce the order shown in the example.
Example:
Enter the number of stairs to climb (positive integer): 4
[1, 1, 1, 1]
[1, 1, 2]
[1, 2, 1]
[2, 1, 1]
[2, 2]
Total number of ways = 5
*/
import java.util.*;
public class WaysToClimb{
    public static int counter = 0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of stairs to climb (positive integer): ");
        helpermethod(console.nextInt());
        System.out.print("Total number of ways = "+counter+"\n");
    }
    public static void helpermethod(int numberofsteps){//starts at position 0, 
        ways(numberofsteps, 0, "[");
    }
    public static void ways(int numberofsteps, int location, String returnstring){
        if(numberofsteps == location){
            int position = returnstring.lastIndexOf(", ");
            //System.out.println("if the number of steps is equal to location, Location = "+ location+" String = "+ returnstring);
            if (position != -1) {
                //System.out.println("if position not equal to -1, Location = "+ location+" String = "+ returnstring);
                returnstring = returnstring.substring(0,position)+ "]";
                System.out.print (returnstring+"\n");
                counter++;//global variable, serves to see how many moves there are 
            }
        }
        else if(numberofsteps>location){
            //System.out.println("Location = "+ location+" String = "+ returnstring);
            ways(numberofsteps, location+1, returnstring+"1, ");//check for climb one stairs first
            //System.out.println("Location = "+ location+" String = "+ returnstring);
            ways(numberofsteps, location+2, returnstring+"2, ");//recurse to check for climb two stairs
        }
    }
}
