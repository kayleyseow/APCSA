/*
Write a program called interleave that accepts two ArrayLists of integers list1
and list2 as parameters and inserts the elements of list2 into list1 at alternating
indexes. If the lists are of unequal length, the remaining elements of the longer
list are left at the end of list1. For example, if list1 stores
[10, 20, 30] and list2 stores
[4, 5, 6, 7, 8],
the call of interleave(list1, list2); should change list1 to store
[10, 4, 20, 5, 30, 6, 7, 8].
If list1 had stored
[10, 20, 30, 40, 50] and list2 had stored
[6, 7, 8], the call of interleave(list1, list2); would change list1 to store
[10, 6, 20, 7, 30, 8, 40, 50].
The end of user input should be signified using a sentinel value of 0 (zero).
Your code need not be robust, but the user may enter nothing but the sentinel
value, i.e. an empty list.
*/

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
