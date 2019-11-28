//write method called doubleArray which takes in int array and doubles every element in the array
public class doubleArray{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter number of elements in your array: ");
		int elementsinarray = console.nextInt();
		System.out.println("Please enter your array: ");
		int[] array = new int[elementsinarray];
		for(int i =0;i<elementsinarray;i++) {
			array[i] = console.nextInt();
		}
		doubleArray(array);
	}
	public static void doubleArray(int[] array){
		for (int i = 0;i<array.length ;i++ ) {
			array[i]*=2;
			System.out.print(array[i]+" ");
		}
	}
}
