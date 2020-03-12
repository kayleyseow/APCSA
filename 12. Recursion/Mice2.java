import java.util.Scanner;

public class Mice2 {

    public static boolean[][] visited;
    public static boolean[][] walls;
    public static char[][] map;
    public static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns, then enter map.");

        int row = sc.nextInt();
        int col = sc.nextInt();

        map = new char[row][col];
        visited = new boolean[row][col];
        walls = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String s = sc.next();
            for (int j = 0; j < col; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        goThrough(0,0);
        if (flag){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

    public static void goThrough(int x, int y){

        if (x==map.length || y==map[0].length || x<0 || y<0 || visited[x][y]||map[x][y] == '+')
            return;


        if(map[x][y] == 'M'){
            flag = true;
            return;
        }

        visited[x][y] = true;

        goThrough(x+1, y);
        goThrough(x-1,y);
        goThrough(x,y+1);
        goThrough(x,y-1);

    }

}
