import java.util.*;
public class Count2{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> Strings = new ArrayList<String>();
        System.out.print("\nPlease enter a sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n\n");
        while(console.hasNext()){
            String input = console.next();
            if(input.equals("lastString"))
                break;
            else{
                Strings.add(input.toLowerCase());
            }
        }
       Count(Strings);
    }
    public static void Count(ArrayList<String> input){
        ArrayList<Integer> count = new ArrayList<Integer>();
        Collections.sort(input);
        for(int i = 0; i < input.size(); i++){
            int num = 0;
            if(i == 0 || (i != 0 && !(input.get(i).equals(input.get(i - 1))))){
                for(int j = 0; j < input.size(); j++){
                    if(input.get(i).equalsIgnoreCase(input.get(j))){
                        num++;
                    }
                }
                count.add(num);
            }
        }
        ArrayList<String> str = new ArrayList<String>();
        for(int i = 0; i < input.size(); i++){
            if(i == 0 || (i != 0 && !(input.get(i).equals(input.get(i - 1))))){
                str.add(input.get(i));
            }
        }
        for(int i = 0; i < count.size(); i++){
            System.out.println(str.get(i) + " " + count.get(i));
        }
    }
    public static ArrayList<String> Separated(ArrayList<String> input){
        ArrayList<String> str = new ArrayList<String>();
        for(int i = 0; i < input.size(); i++){
            if(i != 0 && !(input.get(i).equals(input.get(i - 1)))){
                str.add(input.get(i));
            }
        }
        return str;
    }
}
