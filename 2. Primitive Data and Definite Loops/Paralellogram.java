/* 
prints a paralellogram
         *--*--*
        /  /  /
       *--*--*
      /  /  /
     *--*--*     */
public class Paralellogram {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int spaces = SIZE * (SIZE/2 + 1);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < SIZE; j++) {
                System.out.print("*");
                for (int k = 0; k < SIZE; k++) {
                    System.out.print("-");
                }
            }
           System.out.println("*");
            for (int j = 0; j < SIZE/2; j++) {
               spaces = spaces-1;
                for (int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < SIZE; k++) {
                    System.out.print("/");
                    for (int l = 0; l < SIZE; l++) {
                        System.out.print(" ");
                    }
                }
                System.out.println("/");
            }
            spaces = spaces - 1;
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.print("*");
            for (int j = 0; j < SIZE; j++) {
                System.out.print("-");
            }
        }
        System.out.println("*");
    }
}
