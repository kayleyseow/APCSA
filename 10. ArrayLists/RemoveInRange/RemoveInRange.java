import java.util.*;
public class RemoveInRange{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");
        ArrayList<String> consoleinputarraylist = new ArrayList<String>();
        String input = console.next();
        while(input.compareTo("lastString")!=0){
            consoleinputarraylist.add(input);
            //consoleinputarraylist.add(removePunctuation(input));
            input = console.next();
        }
        System.out.println("Your original list: "+ consoleinputarraylist + "\n");
        System.out.println("Now please enter your start String\n");
        String startString = console.next();
        System.out.println("Finally, please enter your end String\n");
        String endString = console.next();
        System.out.println("Your reduced list: "+removeInRange(consoleinputarraylist, startString, endString));
    }
    public static ArrayList<String> removeInRange(ArrayList<String> stringList,String start, String end){
        String temporary = "";
        for(int i = 0; i < stringList.size(); i++){
            temporary = (String)stringList.get(i);
            //System.out.println(temporary);
            //System.out.println("stringList.get(i) at i = " + i+ " equals "+stringList.get(i));//returns the correct string
            //System.out.println("start equals to: "+start);
            //System.out.println("end equals to: "+end);
            //System.out.println("stringList.get(i).compareTo(start) equals: "+stringList.get(i).compareTo(start));
            if(temporary.compareTo(start) > 0 && temporary.compareTo(end) < 0){
                stringList.remove(i);
                i--;
            }
        }
        return stringList;
    }
    /*public static char[] removePunctuation(String input){
        //System.out.println("input: "+ input);
        char[] char1 = input.toCharArray();
        //System.out.println("input "+ input);
        for (int i = 0;i<input.length() ;i++ ) {
            if ((int)(char1[i])>=65&&(int)(char1[i])<=90) {
                char1[i] = input.charAt(i);
            }
        }
        //String rstr=
        return char2;
    }*/
}