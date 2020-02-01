import java.util.*;
public class Count{
  public static void main(String[] args) {
  	System.out.print("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n\n\n");
    ArrayList<String> words = new ArrayList<String>();
    Scanner console = new Scanner(System.in);
    String input = console.next();
    if (input.equals("lastString")) {
      System.out.print("Your original list: ");
      words.add("");
      System.out.print(words);
      System.out.println();
      System.out.print("Count: ");
      ArrayList<Integer> counters = new ArrayList<Integer>();
      System.out.print(counters);
      System.out.println();
      System.exit(0);
    }
    else if(input != "lastString") {
      while (input != "lastString") {
        words.add(input);
        input = console.next();
        if (input.equals("lastString")) {
          break;
        }
      }
    }
    for(int i=0; i<words.size(); i++) {
      words.set(i, words.get(i).toLowerCase());
    }
    System.out.print("Your original list: " + words +"\n");
    int incrementation = 0;
    int occurence = 0;
    int stringdiff = 0;
    int counter = 0;
    ArrayList<Integer> counters = new ArrayList<Integer>();
    int check = 1;
    for(int i=0; i<words.size()-1; i++) {
      if(words.get(i).equals(words.get(i+1))) {
        check++;
      }
      else {
      	counters.add(check);
      	check = 1;
      }
    }
    counters.add(check);
    Collections.sort(counters);
    System.out.println("Count: " +counters);
  }
}
