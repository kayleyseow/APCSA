import java.util.*;
public class 2DArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // how to declare a 2-d array
        int[][] twod = new int[3][4]; // creates array of 3 rows 4 columns
        System.out.println(twod.length); // prints 3
        System.out.println(twod[0].length); // prints 4 – the 0 can be swapped with any int from 0-2 and it would still work
        // array looks like this
        /* 0 0 0 0
           0 0 0 0
           0 0 0 0 */
        // iterating through the array and setting the value of a cell in the array
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[i].length; j++) {
                twod[i][j] = 5;
            }
        }
        // array looks like this
        /* 5 5 5 5
           5 5 5 5
           5 5 5 5 */
        // accessing the individual cells of an array

    }
}
