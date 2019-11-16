import java.util.Scanner;
public class MaximumNumberAndLoops {
   public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int maxNum = reader.nextInt();
       int loops = reader.nextInt();
       //Print top line of bars separated by spaces
       for (int i = 1;i<=loops;i++){
           for (int j = 0; j < maxNum; j++) {
               System.out.print(" ");
           }
           System.out.print("|");
       }
       
      }
   }
}
