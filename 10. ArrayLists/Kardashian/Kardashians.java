//to be used with the Kartrashians object (no ill will, just tryna learn how to use CompareTo/Comparable)
import java.util.*;
public class Kardashians{
	 public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<Kartrashians> members = new ArrayList<Kartrashians>();
        String name;
        int eyebrow;
        double nail;
        name = console.next();
        while(name.compareTo("stop")!=0){
            eyebrow = console.nextInt();
            nail = console.nextDouble();
            Kartrashians k = new Kartrashians(name, eyebrow, nail);
            members.add(k);
            name = console.next();
        }
        System.out.println("Original list: ");
        System.out.println(members + "\n");
        Collections.sort(members);
        System.out.println("Sorted list: ");
        System.out.println(members);
    }
}
