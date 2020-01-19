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