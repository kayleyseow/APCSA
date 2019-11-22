/*
Here is how the messages will be encrypted:  First, they will be translated into their ASCII values. Then, each ASCII value will be split into four integer parts.  Finally, the middle two values of each section of four will be switched with the adjacent ones.  So, the word <dirt> is encrypted in this way:
1) Translate to ASCII values: 
100 105 114 116
2) Split each value into four different random numbers that add up to the original ASCII value:
25 30 2 43   10 60 6 29   14 30 43 27   1 38 38 39
3) Take the middle two numbers  from each group of four:
25 30 2 43   10 60 6 29   14 30 43 27    1 38 38 39
4) swap them to give the final encrypted message:
25 60 6 43 10 30 2 29 14 38 38 27 1 30 43 39.
If there are an odd number of letters, the last one does not get swapped.  There are many possible encryptions of a given message, but there is only one possible decryption.
For each test case, you will be supplied with the number of elements in the encrypted array, and the list of elements.  For example, one encryption of the message "Have a great day at MSJ!" is:
18 26 1 22 33 26 6 37 23 4 26 42 42 39 14 29 2 6 39 15 11 13 2 41 6 19 12 12 24 5 9 48 24 12 14 34 46 42 14 29 47 25 36 28 10 5 17 45 14 14 7 16 24 1 1 55 23 43 7 25 15 33 16 56 6 21 10 20 33 3 3 33 36 11 6 54 10 21 5 5 7 25 2 31 4 32 7 52 11 8 4 41 9 12 10 12
There are 96 elements in this array.  When decoding this message, your console input / output should look exactly like this:
96
18 26 1 22 33 26 6 37 23 4 26 42 42 39 14 29 2 6 39 15 11 13 2 41 6 19 12 12 24 5 9 48 24 12 14 34 46 42 14 29 47 25 36 28 10 5 17 45 14 14 7 16 24 1 1 55 23 43 7 25 15 33 16 56 6 21 10 20 33 3 3 33 36 11 6 54 10 21 5 5 7 25 2 31 4 32 7 52 11 8 4 41 9 12 10 12
Have a great day at MSJ! 
Note that there is no user prompt. 
*/
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
    if(i == 4){
        first = arr[0] + arr[1] + arr[2] + arr[3];
        System.out.print((char)first);
    }
    System.out.println();
  }
}
