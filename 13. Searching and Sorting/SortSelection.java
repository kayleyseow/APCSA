import java.util.*;
public class SortSelection{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("selectionSort");
		int[] array = new int[10];
		for (int i = 0;i<array.length ;i++ ) array[i]=console.nextInt();
		System.out.println(Arrays.toString(array));
		int k=0, count = 0;
        for (int i = 0; i < 9; i++){
           	int low = Integer.MAX_VALUE;
            for (int j = k; j < 10; j++) {
                if (array[j] < low) {
                    low = array[j];
                    count = j;
                }
            }
            k++;
            int temp = array[i];
            array[i] = low;
            array[count] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
	}
}
