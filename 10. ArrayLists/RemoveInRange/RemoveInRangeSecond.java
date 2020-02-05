import java.util.*;
public class RemoveInRangeSecond{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");
        ArrayList<String> consoleinputarraylist = new ArrayList<String>();
        ArrayList<String> returninputarraylist = new ArrayList<String>();
        String input = console.next();
        while(input.compareTo("lastString")!=0){
            consoleinputarraylist.add(input);
            input = console.next();
        }
        System.out.println("Your original list: "+ consoleinputarraylist + "\n");
        System.out.println("Now please enter your start String\n");
        String startString = console.next();
        System.out.println("Finally, please enter your end String\n");
        String endString = console.next();
        System.out.println("Your reduced list: "+removeInRange(consoleinputarraylist, returninputarraylist, startString, endString));
    }
    public static ArrayList<String> removeInRange(ArrayList<String> stringList,ArrayList<String> rsl, String start, String end){
        for (int i = 0; i < stringList.size(); i++){
            String temporary = stringList.get(i);
            if (temporary.compareTo(start) < 0){
                rsl.add(temporary);
            }
            else if (temporary.compareTo(end) > 0){
                rsl.add(temporary);
            }
        }
        return rsl;
    }
}
