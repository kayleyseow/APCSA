import java.util.*;
public class Hops{
	private static int height;
    private static ArrayList<Integer> hopsList = new ArrayList<Integer>();
    /*Set the integer as the height*/
    public static void setHeight(int h){
    	height = h;
    }
    /*Return height*/
    public static int getHeight(){
    	return height;
    }
    /*Set the arraylist as hopsList*/
    public static void setHopsList(ArrayList<Integer> jumps){
    	hopsList = jumps;
    }
    /*Return hops list*/
    public static ArrayList<Integer> getHopsList(){
    	return hopsList;
    }
    /*Calculate list of steps touched to the top*/
    public static ArrayList<Integer> listOfStepsToTop(){
    	int stepsheight = getHeight();
    	ArrayList<Integer> stepsList = new ArrayList<Integer>();
    	for (int i = 0; i<getHopsList().size();i++) stepsList.add(getHopsList().get(i));
    	ArrayList<Integer> returnlist = new ArrayList<Integer>();
    	while (stepsList.size()>0){
    		int compare = 0;
    		for (int i = 0;i<stepsList.size();i++) if (stepsList.get(i)>compare) compare=stepsList.get(i);
    		stepsList.remove((Integer)compare);
    		for (int i = 0;i<stepsheight/compare;i++){
    			//System.out.println(compare);//test, this method works
    			returnlist.add(compare);
    		}
    		stepsheight = stepsheight%compare;
    	}
    	//System.out.println(returnlist.size());
    	//System.out.println(returnlist);//prints out correct arraylist
    	return returnlist;
    }
    /*Calculate minimum number of steps touched (number of hops) to the top*/
    public static int numberOfStepsToTop(){
    	return listOfStepsToTop().size();
    }
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of hop sizes, followed by the ");
		System.out.println("corresponding list of allowed hop sizes, ");
		System.out.println("followed by the staircase height, all space ");
		System.out.print("separated: ");
		int hopsizes = console.nextInt();
		ArrayList<Integer> hopsizesarray = new ArrayList<Integer>();
		for (int i=0;i<hopsizes;i++) hopsizesarray.add(console.nextInt());
		int height = console.nextInt();
		setHeight(height);
		setHopsList(hopsizesarray);
		System.out.println(numberOfStepsToTop());
		System.out.println(listOfStepsToTop());
    }
}