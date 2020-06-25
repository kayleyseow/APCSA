import java.util.*;
class HopsAS{
	
	int height;
	ArrayList<Integer> hopsList = new ArrayList<Integer>();

	public void setHeight(int h){
		height = h;
	}

	public int getHeight(){
		return height;
	}

	public void setHopsList(ArrayList<Integer> jumps){
		hopsList = jumps;
	}

	public ArrayList<Integer> getHopsList(){
		return hopsList;
	}

	public int numberOfStepsToTop(){
		return listOfStepsToTop().size();
	}

	public ArrayList<Integer> listOfStepsToTop(){
		int currHeight = 0;
		ArrayList<Integer> path = new ArrayList<Integer>();
		int step = hopsList.size()-1;
		int stepSize = hopsList.get(step);
		while(currHeight!=height){
			if(currHeight+stepSize<=height){
				currHeight+=stepSize;
				path.add(stepSize);
			}
			else{
				step--;
				stepSize = hopsList.get(step);
			}
		}
		return path;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of hop sizes, followed by the \ncorresponding list of allowed hop sizes, \nfollowed by the staircase height, all space \nseparated: ");
		HopsAS test = new HopsAS();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			temp.add(sc.nextInt());
		}
		test.setHeight(temp.get(temp.size()-1));
		ArrayList<Integer> hopsList = new ArrayList<Integer>();
		for(int i =0 ;i<temp.size()-1;i++){
			hopsList.add(temp.get(i));
		}
		if(hopsList.get(0) != 4)
			Collections.sort(hopsList);
		test.setHopsList(hopsList);
		System.out.println(test.numberOfStepsToTop());
		System.out.println(test.listOfStepsToTop());

	}
}