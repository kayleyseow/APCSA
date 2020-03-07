/*
Write a recursive method mysteryMethod that accepts a list of integers, L, and an integer 
limit, n, as parameters and uses backtracking to find the maximum sum that can be generated
by adding elements of L that does not exceed n. For example, if you are given the list
[7, 30, 8, 22, 6, 1, 14] and the limit of 19, the maximum sum that can be generated that
does not exceed 19 is 16, achieved by adding 7, 8, and 1. If the list L is empty, or if
the limit is not a positive integer, or all of L’s values exceed the limit, return 0.
Each index’s element in the list can be added to the sum only once, but the same number
value might occur more than once in a list, in which case each occurrence might be added
to the sum. For example, if the list is [6, 2, 1] you may use up to one 6 in the sum, but
if the list is [6, 2, 6, 1] you may use up to two sixes.

List L                      Limit n     Return Value 
 
[7, 30, 8, 22, 6, 1, 14]    19          16
[5, 30, 15, 13, 8]          42          41
[30, 15, 20]                40          35
[10, 20, 30]                7           0
[10, 20, 30]                20          20
[ ]                         10          0

You may assume that all values in the list are nonnegative. Your method may alter the
contents of the list L as it executes, but L should be restored to its original state
before your method returns. Do not use any loops. 

Your input should be structured as follows:
{number of elements in array} {array, space separated} {integer limit}

input: 7 7 30 8 22 6 1 14 19
output: 16
*/
import java.util.*;
public class Mystery{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int elementsinarray = console.nextInt();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0;i<elementsinarray ;i++ ) {
            alist.add(console.nextInt());
        }
        int integerlimit = console.nextInt();
        System.out.println(helpermethod(alist, integerlimit));
    }
    public static int helpermethod(List<Integer> list, int intlimit) {
        return mysteryMethod(list, 0, intlimit, list.size());
    }
    public static int mysteryMethod(List<Integer> list, int arrindex, int intlimit, int rem) {
        if(intlimit <= 0 || rem == 0)
            return 0;
        int withanint = list.get(arrindex) + mysteryMethod(list, arrindex + 1, intlimit - list.get(arrindex), rem - 1);
        int withoutanint = mysteryMethod(list, arrindex + 1, intlimit, rem - 1);
        if(withanint <= intlimit && intlimit -withanint < intlimit - withoutanint)
            return withanint;
        return withoutanint;
    }
}
