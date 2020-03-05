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