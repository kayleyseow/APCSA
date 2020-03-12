import java.util.*;
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