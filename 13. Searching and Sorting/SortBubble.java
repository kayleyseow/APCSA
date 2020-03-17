import java.util.*;
public class SortBubble{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("bubbleSort");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
		System.out.println(Arrays.toString(array));
    int size = array.length;
		for (int i = 0; i < size - 1; i++){
		    for (int j = 0; j < size - i - 1; j++){
		        if (array[j] > array[j + 1]){
		            int temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		        }
		    }
		    System.out.println(Arrays.toString(array));
		}
		System.out.println();
	}
}
