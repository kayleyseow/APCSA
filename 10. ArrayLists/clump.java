import java.util.*;
public class clump{
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
        System.out.println("Your clumped list: "+Clump(alist));//send the Arraylist to the method and returns clumped list
    }
    public static ArrayList Clump(ArrayList stringList){
        ArrayList<String> arraylist = new ArrayList<String>();
        int counter = 0;
        for(int i = 0; i < stringList.size() - 1; i+=2){//for even numbers of strings
            String newString = "(" + stringList.get(i) + " "+ stringList.get(i+1) + ")";//clumps the string together
            arraylist.add(newString);//adds the newstring to the ArrayList
            counter += 2;//adds 2 to the counter
        }
        if (counter < stringList.size()){//for odd numbers of string(s)
            String newstring =  ""+stringList.get(counter);
            arraylist.add(newstring);//adds the newstring to the ArrayList
        }
        return arraylist;
    }
}
