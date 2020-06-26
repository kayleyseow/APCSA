import java.util.*;
public class HopsTest{
    /*Calculate list of steps touched to the top*/
    public static ArrayList<Integer> listOfStepsToTop(ArrayList<Integer> stepsList,int stepsheight){
    	ArrayList<Integer> returnlist = new ArrayList<Integer>();
    	while (stepsList.size()>0){
    		int compare = 0;
    		for (int i = 0;i<stepsList.size();i++){
                if (stepsList.get(i)>compare) compare=stepsList.get(i);
            } 
    		stepsList.remove((Integer)compare);
    		for (int i = 0;i<stepsheight/compare;i++){
                returnlist.add(compare);
            } 
    		stepsheight = stepsheight%compare;
    	}
    	return returnlist;
    }
    /*Calculate minimum number of steps touched (number of hops) to the top*/
    public static int numberOfStepsToTop(ArrayList<Integer> hopsizesarray,int height){
    	return listOfStepsToTop(hopsizesarray, height).size();
    }
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of hop sizes: ");
        int hopsizes = console.nextInt();
        System.out.println("Enter list of hop sizes: ");
        ArrayList<Integer> hopsizesarray = new ArrayList<Integer>();
        for (int i=0;i<hopsizes;i++) hopsizesarray.add(console.nextInt());
        Collections.sort(hopsizesarray);
        System.out.println("Enter height: ");
        int height = console.nextInt();
		System.out.println(numberOfStepsToTop(hopsizesarray,height));
        ArrayList<Integer> returnedarray = new ArrayList<Integer>();
        returnedarray=listOfStepsToTop(hopsizesarray,height);
		for (int i=0;i<returnedarray.size();i++){
            System.out.println(returnedarray.get(i)+",");
        }
    }
}