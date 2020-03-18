import java.util.*;
public class SortInsertion{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("insertionSort");
		int[] array = new int[10];
		for (int i=0;i<array.length;i++) array[i]=console.nextInt();
		int i, key, j;
        for (i = 1; i < 10; i++) {
            System.out.println(Arrays.toString(array));
            key = array[i];
            j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        System.out.println(Arrays.toString(array) + "\n");
	}
}
