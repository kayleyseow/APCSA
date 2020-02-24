/*
Write a recursive program called BinarySearch which takes in an array of
distinct integers from the console and returns the index of one of those
integers (or -1 if the integer cannot be found).
Hint: Repeatedly subdivide the array into half.
The input will be structured as follows:
{number of elements in array} {array, space separated} {number to find}
Ex: 5 2 4 6 8 10 8
You can assume that the array is in ascending numeric order.
Your output should be a single integer, representing an index in the array. Ex: 3
*/
import java.util.Scanner;
public class BinarySearch2{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numbersinarray = console.nextInt();
        int arr[] = new int[numbersinarray];
        for(int i =0;i<numbersinarray;i++) {
            arr[i] = console.nextInt();
        }
        int num = console.nextInt();
        int result = binarySearch(arr,num);
        if(result!= -1) {
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }
    }
    public static int binarySearch(int input[], int element) {
        int start,end;
        start = 0;
        end = input.length-1;
        return binarySearch(input,element,start,end);   
    }
    public static int binarySearch(int input[], int element, int start, int end){
        if(start>=end){
            if(input[end]==element){
                return end;
            }
            else{
                return -1;
            }
        }
        int mid = (start+end)/2;
        if(input[mid]==element){
            return mid;
        }
        else if(input[mid]>element){
            return binarySearch(input,element,start,mid-1);   
        }
        else{
            return binarySearch(input,element,mid+1,end);
        }
    }
}
