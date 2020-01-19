import java.util.*;
public class interLeave{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        ArrayList<Integer> alist1 = new ArrayList<Integer>();
        int inputthing1 = 0;
        do{
            inputthing1 = console.nextInt();
            if (inputthing1!=0) {
                alist1.add(inputthing1);
            }
        }
        while(inputthing1!=0);
        System.out.print("\nYour first list: "+alist1+"\n");
        System.out.print("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        ArrayList<Integer> alist2 = new ArrayList<Integer>();
        int inputthing2 = 0;
        do{
            inputthing2 = console.nextInt();
            if (inputthing2!=0) {
                alist2.add(inputthing2);
            }
        }
        while(inputthing2!=0);
        System.out.println("\nYour second list: "+alist2+"\n");
        System.out.println("Your interleaved list: " + Interleave(alist1,alist2) );
    }
    public static ArrayList Interleave(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        int repeats = Math.min(array1.size(), array2.size());
        int i;
        for (i = 0; i < repeats; i++) {
            int x = array2.get(i);
            array1.add(2 * i + 1, x);
        }
        
        if (i < array2.size()) {
            for (int j = i; j < array2.size(); j++) {
                array1.add(array2.get(j));
            }
        }
        return array1;
    }
}