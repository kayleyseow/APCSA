//prints the inputted String ArrayList backwards
import java.util.*;
public class BackwardsArrayList{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);//sets up the scanner
        System.out.print("\nPlease enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n");
        ArrayList<String> alist = new ArrayList<String>();//define a new String ArrayList
        String consoleinput = "";//define a string
        for(;;){// an infinite loop until break
            consoleinput = console.next();
            if(consoleinput.equals("stop")){//stops at the sentinel value
                break;
            }
            alist.add(consoleinput);//adds the console input to the String ArrayList
        }
        System.out.println("\nYour original list: "+alist+"\n");//prints out the original inputted String ArrayList
        System.out.println("Your backwards list: "+backwards(alist));
    }
    public static ArrayList<String> backwards(ArrayList <String> stringList){
        ArrayList<String> arraylist = new ArrayList<String>();
        for (int i = stringList.size()-1;i>=0;i-- ) {
            arraylist.add(stringList.get(i));
        }
        return arraylist;
    }
}