import java.util.*;
import java.io.*;
public class RemoveEvensForReal{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        ArrayList <String> words = new ArrayList<String> ();
        File inputfile = new File(console.nextLine());
        int beginning = console.nextInt();
        int end = console.nextInt();
        console = new Scanner(inputfile);
        int intsize = 0;
        int finsize = 0;
        while (console.hasNext()) {
            String word = console.next();
            if (word.length() % 2 != 0){
                finsize++;
                words.add(word);
            }
            intsize++;
        }
        console.close();  
        System.out.print("Removes strings of even length from an array.\nEnter filename for file containing strings: Enter two indices for range of odd words to be printed out: \ninitial list.size(): " + intsize+"\nfinal   list.size(): " + finsize +"\n");
        for (int i = beginning; i <=end; i++) {
            System.out.println(words.get(i));
        }
    }
}    
            