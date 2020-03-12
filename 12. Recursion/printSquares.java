/*
Implement a recursive method called printSquares to find all the ways to express an integer
as the sum of squares of unique positive integers.   For example, the call printSquares(200)
should produce the following output:

positive integer: 200
unique bases: [1, 2, 3, 4, 5, 8, 9]
unique bases: [1, 2, 3, 4, 7, 11]
unique bases: [1, 2, 5, 7, 11]
unique bases: [1, 3, 4, 5, 6, 7, 8]
unique bases: [1, 3, 4, 5, 7, 10]
unique bases: [2, 4, 6, 12]
unique bases: [2, 14]
unique bases: [3, 5, 6, 7, 9]
unique bases: [6, 8, 10]

For a given solution, the list of bases should be in ascending order as in the example.
For numbers such as 32 and 128, which cannot be represented as a sum of unique squares,
your method should produce no output.
*/import java.util.*;
public class printSquares{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("positive integer: ");
        helpermethod(console.nextInt());
    }
    public static void helpermethod(int n){
        ArrayList<Integer> alist = new ArrayList<Integer>();
        printsquares(n, alist, 1);
    }
    public static void printsquares(int n, ArrayList<Integer> arraylist, int i) {
        if(n < 0)
            return;
            
        if(n == 0) {
            System.out.println ("unique bases: "+arraylist.toString());
            return;
        }
        
        if(i * i > n)
            return;
            
        arraylist.add(i);
        printsquares(n - i * i, arraylist, i + 1);
        arraylist.remove(arraylist.size() - 1);
        printsquares(n, arraylist, i + 1);    
    }
}
