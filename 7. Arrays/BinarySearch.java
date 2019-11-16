import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int numbersinarray = s.nextInt();
        System.out.println("Enter the terms: ");
        int arr[] = new int[numbersinarray];
        for(int i =0;i<numbersinarray;i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number you want to search.");
        int num = s.nextInt();
        int result = binarySearch(arr,num);
        if(result!= -1) {
            System.out.println("The number is at index: "+ result);
        }
        else {
            System.out.println("Number Not Found.");
        }
    }

}
