import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
public class HogwartsMurderMystery{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner console = new Scanner(System.in);
    int total = console.nextInt();
        int arr[] = new int[8];
    int i = 0;
    int first = 0;
    int counter = 0;
    int second = 0;
    while (console.hasNextInt()){
      arr[i] = console.nextInt();
      i++;
      counter++;
      if(i == 8){
          first = arr[0] + arr[3] + arr[5] + arr[6];
          second = arr[1] + arr[2] + arr[4] + arr[7];
          System.out.print((char)first);
          System.out.print((char)second);
          i = 0;
      }
    }

  }
}
