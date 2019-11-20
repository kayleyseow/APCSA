/*
pastures are planted at coordinates, which can be measured by 
upper left corner (x1, y1) and bottom right corner (x2, y2).
Please write a program to help him find how much fence he needs
to buy. 
*/
import java.util.*;
public class FenceArea{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leastx = input.nextInt();
        int maxy = input.nextInt();
        int maxx = input.nextInt();
        int leasty = input.nextInt();
        for (int i = 1; i < n; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            if (x1 < leastx) {
                leastx = x1;
            }
            if (y1 > maxy) {
                maxy = y1;
            }
            if (x2 > maxx) {
                 maxx = x2;
            }
            if (y2 < leasty) {
                leasty = y2;
            }
        }
        System.out.println(2*(maxx - leastx)+2*(maxy - leasty));
    }
}
