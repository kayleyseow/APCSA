import java.util.*;
public class DeleteSortIntegersArrayList{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        ArrayList<Integer> alist = new ArrayList<Integer>();
        int inputthing1 = 0;
        do{
            inputthing1 = console.nextInt();
            if (inputthing1!=0) {
                alist.add(inputthing1);
            }
        }
        while(inputthing1!=0);
        System.out.print("\nYour first list: "+alist+"\n");
        System.out.println("Your Sorted and Deleted list: " + sortanddelete(alist));
    }
    public static ArrayList<Integer> sortanddelete(ArrayList<Integer> array) {
        ArrayList<Integer> returnalist = new ArrayList<Integer>();
        for (int i = 0;i<array.size() ; i++) {
            if(returnalist.contains(array.get(i))==false){
                returnalist.add(array.get(i));
            }
            Collections.sort(returnalist);
        }
        return returnalist;
    }
}