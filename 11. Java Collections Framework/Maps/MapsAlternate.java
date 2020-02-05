//another version for the Maps assignment
import java.util.*;
import java.io.*;
public class MapsAlternate{
    public static void main(String[] args) throws IOException { // ioexception for input output exception
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int k = console.nextInt();
        int q = console.nextInt();
        Map <String, Integer> word = new HashMap<>();
        for(int i = 0; i < n; i++)
            word.put(console.next(), console.nextInt());
        for(int i = 0; i < k; i++){
            String in = console.next();
            word.put(in, console.nextInt() + word.get(in));
        }
        long sum = 0;
        for(int i = 0; i < q; i++){
            sum += word.get(console.next());
            sum %= 1000000007;
        }
        System.out.println(sum);
    }
}
