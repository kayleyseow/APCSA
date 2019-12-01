import java.util.*;
public class deleteHistory{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		System.out.println("Please enter number that you want to erase: ");
		int deletevalue = console.nextInt();
		DeleteHistorymethod(array,deletevalue);
	}

}
	
