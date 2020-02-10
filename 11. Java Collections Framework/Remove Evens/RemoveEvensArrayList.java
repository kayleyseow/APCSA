import java.util.*;
import java.io.*;
public class RemoveEvensArrayList {
    public static void main(String[] args) throws FileNotFoundException {// if the user inputs wrong/missing file, will give this message
        Scanner console = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> oddwordsalist = new ArrayList<String>();
        System.out.print("Removes Strings of even length from an array\nEnter filename for file containing Strings: ");
        String filename = console.next();
        File inputtedfilename = new File (filename);
        Scanner consoleinput = new Scanner(inputtedfilename);
        while(consoleinput.hasNext()) {
            list.add(consoleinput.next());
        }
        String currentstring;
        System.out.print("initial list.size(): " + list.size()+"\n");
        for (int i = 0;i<list.size() ;i++ ) {
            currentstring = list.get(i);
            if(currentstring.length() %2==1) {
              oddwordsalist.add(currentstring);
            }
        }
        System.out.print("final   list.size(): " +oddwordsalist.size()+"\n");
    }
}
