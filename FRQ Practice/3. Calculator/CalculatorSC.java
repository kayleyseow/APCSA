import java.util.*;
public class CalculatorSC {
	public static void main(String args[]) {
        CalculatorSC calc = new CalculatorSC();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers, space separated: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.multiply(n1, n2));
        System.out.println(calc.divide(n1, n2));
    
    } //end main
	public int add(int a, int b) {
		for(int i = 0; i < b; i++) {
			a++;
		} //end for
		return a;
		
	} //end add

	public int subtract(int a, int b) {
		for(int i = 0; i < b; i++) {
			a--;
		} //end for
		return a;
	} //end subtract

	public int multiply(int a, int b) {
        if (b == 0) return 0;
		return  add(a, multiply(a, b-1));
		
	} //end multiply

	public int divide(int a, int b) {

        if (a == 0) return 0;
        if ( b > a ) return 0;
		return add(1,  divide(subtract(a, b), b));

	} //end divide
} //end class