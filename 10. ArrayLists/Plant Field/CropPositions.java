import java.util.*;
public class CropPositions{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int l = console.nextInt();//constant for legume crop
        int c = console.nextInt();//constant for corn crop
        int r = console.nextInt();//constant for rice crop
        int k = console.nextInt();//constant to switch row
        int m = console.nextInt();//months
        System.out.print(plantFarm(l,c,r,k,m));
    }
    public static ArrayList<ArrayList<Character>> plantFarm(int l, int c, int r, int k, int m) {
        ArrayList<ArrayList<Character>> farm = new ArrayList<ArrayList<Character>>();
        String s = "";
        for (int i = 0; i < m; i++) {
            int count = 0;
            ArrayList<Character> currfarm = new ArrayList<Character>();
            farm.add(currfarm);
            if ((i+1)%l == 0) {
                count++;
            }
            if ((i+1)%c == 0) {
                count++;
            }
            if ((i+1)%r == 0) {
                count++;
            }  
            if(count + (s.length() % k) >= k) {
                s += '\n';
            }
            if ((i+1)%l == 0) {
                s += "L";
            }
            if ((i+1)%c == 0) {
                s += "C";
            }
            if ((i+1)%r == 0) {
                s += "R";
            }
            for (int j = 0; j < s.length(); j++) {
                farm.get(i).add(s.charAt(j));
            }
        }
        return farm;
    }
}