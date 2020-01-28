import java.util.*;
public class CornfieldMaze{
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("\nPlease enter a sequence of directions separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value stop, followed by a return.\n");
        ArrayList<String> alist = new ArrayList<>();//initialize a string arraylist
        String consoleinput = "";//set initial string
        int inputthing = 0;//the int i=0 of the code
        while(inputthing==0) {
            consoleinput = console.next();//every element that you enter
            if(consoleinput.equals("stop")){//check for sentinel value
                break;//breaks out of the while loop
            }
            alist.add(consoleinput);//adds value to the arraylist
        }	
        int [][] map = arraydimensions(alist);//send to method to find dimensions of 2D array	
        map = printmap(map, alist);//send to method to fill in the 2D array
        for (int i=0;i<map.length ;i++ ) {//prints out the array
        	for (int j = 0;j<map[i].length ;j++ ) {
        		System.out.print(map[i][j]+" ");
        	}
        	System.out.println();
        }
	}
	public static int[][] arraydimensions(ArrayList arraylist){
		int currentx = 1;//starts at 1 cause arrays are annoying
		int currenty = 1;//also starts at 1 cause arrays are annoying
		int maxx = 0;
		int maxy = 0;
		for (int i = 0;i<arraylist.size() ;i++ ){//checks the string list and then checks to see directions
			if (arraylist.get(i).equals("down")){
				currentx++;//adds when goes down because arrays work that way
				if (currentx>maxx){//check to see max
					maxx=currentx;
				}
			}
			else if (arraylist.get(i).equals("right")) {
				currenty++;
				if(currenty>maxy){//check to see max
					maxy=currenty;//set to max
				}
			}
			else if (arraylist.get(i).equals("up")) {
				currentx--;
			}
			else if(arraylist.get(i).equals("left")) {
				currenty--;
			}
		}
		int[][] array = new int[maxx][maxy];
		return array;
	}
	public static int[][] printmap(int[][]array, ArrayList stringList){//inputs 1 where the map will be
		int currentx = 0;
		int currenty = 0;
		array[currentx][currenty] = 1;//always starts at [0][0], thus array[currentx][currenty] = 1
		for (int i = 0;i<stringList.size() ;i++ ) {//checks the string list and then checks to see directions
			if (stringList.get(i).equals("down")) {
				currentx++;
				array[currentx][currenty] = 1;
			}
			else if (stringList.get(i).equals("right")) {
				currenty++;
				array[currentx][currenty] = 1;
			}
			else if (stringList.get(i).equals("up")) {
				currentx--;
				array[currentx][currenty] = 1;
			}
			else if(stringList.get(i).equals("left")) {
				currenty--;
				array[currentx][currenty] = 1;
			}
		}
		array[currentx][currenty] = 1;	
		return array;
	}
}