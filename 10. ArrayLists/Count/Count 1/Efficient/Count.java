import java.util.*;
public class Count{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n\n\n");
        ArrayList<String> consoleinputarraylist = new ArrayList<String>();
        String input = "";
        input = console.next();
        while(input.compareTo("lastString")!=0){
            consoleinputarraylist.add(input);
            input = console.next();
        }
        System.out.println("Your original list: "+ consoleinputarraylist);
        for (int i = 0;i<consoleinputarraylist.size() ;i++ ) {
            consoleinputarraylist.set(i, consoleinputarraylist.get(i).toLowerCase());
        }
        System.out.println("Count: "+ sortArray(consoleinputarraylist));
    }
    public static ArrayList<Integer> sortArray(ArrayList<String> array){
        int counter = 1;
        ArrayList<Integer> alistreturn = new ArrayList<Integer>();
        for (int i = 1;i<array.size() ;i++ ) {
            if (array.get(i).equals(array.get(i-1))) {
                counter++;
            }
            else{
                alistreturn.add(counter);
                counter=1;
            }
        }
        alistreturn.add(counter);
        return alistreturn;
    }
}
