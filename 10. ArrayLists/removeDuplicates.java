/*
Write a class called RemoveDuplicates that takes a sorted ArrayList of strings and eliminates
any duplicates from the list. For example, the list
[be, be, is, not, or, the, to, to] should be converted to [be, is, not, or, the, to].
Your method to test for a duplicate should be case insensitive, e.g.
[be, Be, twice] should be converted to [be, twice], and
[Be, be, twice] should be converted to [Be, twice].
Note that because the values will be sorted, all of the duplicates will be grouped together.
Assume that the ArrayList contains only String values, but keep in mind that it might be empty.
Have the user input strings from the console to populate your ArrayList.  Assume that the user
enters only String values, and that the String values are entered in correct alphabetical order.
Your code need not be robust.  The end of user input should be signified by the user entering
the String value "lastString" followed by a return, e.g. a complete line of user input might
look like:  a b c c d lastString, signifying that the starting array is [a, b, c, c, d].
*/
import java.util.*;
public class removeDuplicates{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);//initialize console
        System.out.print("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");
        ArrayList<String> alist = new ArrayList<>();//initialize a string arraylist
        String consoleinput = "";//set initial string
        int inputthing = 0;//the int i=0 of the code
        while(inputthing==0) {
            consoleinput = console.next();//every element that you enter
            if(consoleinput.equals("lastString")){//check for sentinel value
                break;//breaks out of the while loop
            }
            alist.add(consoleinput);//adds value to the arraylist
        }
        System.out.print("\n\nYour original list: "+alist+"\n");
        for(int i = 1; i < alist.size(); i++){
            if (alist.get(i).toUpperCase().equals(alist.get(i-1).toUpperCase())){//changes string to uppercase to compare
                alist.remove(i);//if they are the same, then remove the higher index
                i--;
            }
        }
        System.out.println("\nYour list with duplicates removed: "+alist+"\n");
    }
}
