import java.util.*;
public class maxSum{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int elementsinarray = console.nextInt();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0;i<elementsinarray ;i++ ) {
            alist.add(console.nextInt());
        }
        //System.out.println(alist);
        int integerlimit = console.nextInt();
        System.out.println(maxSum(alist, integerlimit));
    }
    public static int maxSum(List<Integer> list, int intlimit) {
        return maxSum(list, 0, intlimit, list.size());
    }

    public static int maxSum(List<Integer> list, int arrindex, int intlimit, int rem) {
        if(intlimit <= 0 || rem == 0)
            return 0;
        int withanint = list.get(arrindex) + maxSum(list, arrindex + 1, intlimit - list.get(arrindex), rem - 1);
        int withoutanint = maxSum(list, arrindex + 1, intlimit, rem - 1);
        if(withanint <= intlimit && intlimit -withanint < intlimit - withoutanint)
            return withanint;
        return withoutanint;
    }
}