import java.util.*;
public class BackTrackTravel{
    public static int counter = 0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter (x, y) coordinates as two integers separated by a space: \n");
        traverseplane(console.nextInt(), console.nextInt(), 0, 0, "");
        System.out.print("Number of paths = " + counter+ "\n");
    }
    public static void traverseplane(int targetX, int targetY, int currX, int currY, String path){
        if(currX == targetX && currY == targetY) {
            System.out.println("moves:" + path);
            counter++;
        }
        else if(currX <= targetX && currY <= targetY){
            traverseplane(targetX, targetY, currX, currY + 1, path + " N");
            traverseplane(targetX, targetY, currX + 1, currY + 1, path + " NE");
            traverseplane(targetX, targetY, currX + 1, currY, path + " E");
        }
    }
}