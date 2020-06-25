import java.util.Scanner;

public class CalculatorCT {
    private int a = 0;
    private int b = 0;
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        a++;
        b--;
        return add(a,b);
    }   
    public int subtract (int a, int b) {
        if (b == 0) {
            return a;
        }
        a--;
        b--;
        return subtract(a, b);
    }
    public int multiply (int a, int b) {
        if (b == 1) {
            return a;
        }
        return add(multiply(a, subtract(b,1)), a);
    }
    public int divide (int a, int b) {
        if (a >= b) {
            return add(divide(subtract(a, b),b),1); 
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers, space separated: ");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        CalculatorCT c = new CalculatorCT(); 
        System.out.println(c.add(a, b));
        System.out.println(c.subtract(a, b));
        System.out.println(c.multiply(a, b));
        System.out.println(c.divide(a, b));
    }
}
