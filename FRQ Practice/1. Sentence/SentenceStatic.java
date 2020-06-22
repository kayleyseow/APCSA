import java.util.*;
public class SentenceStatic{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = console.nextLine();
        //System.out.println(sentence);;
        System.out.println(getBlankPositions(sentence));
        System.out.println(countWords(getBlankPositions(sentence)));
        String[] printfinal = getWords(sentence);
        System.out.print("{");
        for (int i=0;i<printfinal.length ;i++ ) {
            System.out.print(printfinal[i]);
            if (printfinal.length>1&&i<printfinal.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }
    public static ArrayList<Integer> getBlankPositions(String originalsentence){
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i=0;i<originalsentence.length();i++) if (originalsentence.substring(i,i+1).equals(" ")) alist.add(i);
        return alist;
    }
    public static int countWords(ArrayList<Integer> spaceslist){
        return spaceslist.size()+1;
    }
    public static String[] getWords(String sentence ){
        String[] words = sentence.split(" ");
        return words;
    }
}
