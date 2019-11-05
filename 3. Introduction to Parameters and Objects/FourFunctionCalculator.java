/*
Build a four-function calculator that prints the sum, difference, product,
and quotient of two doubles. Your main{} method should create a scanner
object, call five other methods to take in user input and do the
four calculations, and print the results. Your objective is to keep
main{} streamlined, as any "control central" should be, which is the key
attribute in producing future-readable code. It is possible to do this in
less than 40 lines.
*/
import java.util.*;
public class FourFunctionCalculator{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println ("");
		System.out.print("Please enter your first  number: ");
		double input1 = console.nextDouble();
		System.out.println("Please enter your second number: ");
		double input2 = console.nextDouble();
		System.out.println("sum        = " + calsum(input1, input2));
		System.out.println("difference = " + caldif(input1, input2));
		System.out.println("product    = " + calpro(input1, input2));
		System.out.println("quotient   = " + calquo(input1, input2));
		System.out.println ("");		
	}
	public static double calsum(double a, double b){
		double c = a+b;
		return c;
	}
	public static double caldif(double a, double b){
		double d = a-b;
		return d;
	}
	public static double calpro(double a, double b){
		double e = a*b;
		return e;
	}
	public static double calquo(double a, double b){
		double f = a/b;
		return f;
	}

}