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
	public static void DeleteHistorymethod(int[] array, int x){
		int[] array2 = new int[array.length];
		int counter = 0;
		for (int i = 0;i<array.length ;i++ ) {
			if (array[i]!=x) {
				array2[counter++]=array[i];
			}
		}
		int[] array3 = new int[array2.length];
		for (int i = 0;i<array2.length;i++ ) {
			array3[i] = array2[i];
		}
		for (int i = 0;i<array3.length ;i++ ) {
			System.out.println(array3[i]+ " ");
		}
	}
}
	
