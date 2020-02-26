import java.util.*;
public class Permutation {
    public static TreeSet<String> results = new TreeSet<String>();
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input string: ");
        permutation("", console.next());
        printcombo();
    }
    public static void permutation(String prefix, String str) {
        int length = str.length();
        if (length == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {

                String p = prefix + str.charAt(i);
                String s = str.substring(0, i) + str.substring(i + 1, length);

                permutation(p, s);
            }
        }
    }
    public static void printcombo() {
        int index = 0;
        for (String permu : results) {
            System.out.println(permu);
        }
    }
}