import java.util.*;
public class checkCycles{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the number of elements in array");
		int elements = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elements];
        	for(int i =0;i<elements;i++) {
           		array[i] = console.nextInt();
        	}	
        	System.out.println("Please enter an integer cycle length: ");
        	int cyclelength = console.nextInt();
        	System.out.println(checkCycles(array,cyclelength));
	}
	public static boolean checkCycles(int[] array, int n){
		int next = n;
		for (int i = 0;i<array.length ;i++ ) {
			if (next>=array.length||next<0) {
				return false;
			}
			else{
				next = array[next];
			}
			if (next==n) {
				return true;
			}
		}
		return false;
	}
}
