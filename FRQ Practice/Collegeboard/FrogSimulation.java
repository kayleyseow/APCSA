//from 2018 APCS exam, Q1
/*
a.
Write the simulate method, which simulates the frog attempting to hop in a straight line to a goal from the frog's starting position of 0 within a maximum number of hops. The method returns true if the frog successfully reached the goal within the maximum number of hops; otherwise, the method returns false.
The FrogSimulation class provides a method called hopDistance that returns an integer representing the distance (positive or negative) to be moved when the frog hops. A positive distance represents a move toward the goal. A negative distance represents a move away from the goal. The returned distance may vary from call to call. Each time the frog hops, its position is adjusted by the value returned by a call to the hopDistance method.
The frog hops until one of the following conditions becomes true:
• The frog has reached or passed the goal.
• The frog has reached a negative position.
• The frog has taken the maximum number of hops without reaching the goal.
The following example shows a declaration of a FrogSimulation object for which the goal distance is 24 inches and the maximum number of hops is 5. The table shows some possible outcomes of calling the simulate method.
	FrogSimulation sim = new FrogSimulation(24, 5);
b. 
Write the runSimulations method, which performs a given number of simulations and returns the proportion of simulations in which the frog successfully reached or passed the goal. For example, if the parameter passed to runSimulations is 400, and 100 of the 400 simulate method calls returned true, then the runSimulations method should return 0.25.
Complete method runSimulations below. Assume that simulate works as specified, regardless of what you wrote in part (a). You must use simulate appropriately to receive full credit.
*/
import java.util.*;
public class FrogSimulation{
	//distance, in inches, from starting postion to the goal
	private int goalDistance;
	//max # of hops allowed to reach goal
	private int maxHops;
	Scanner sc = new Scanner(System.in);
	//connstructs a FrogSimulation where dist is the distance, in inches, from the starting
	//position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
	//PreconditionL dist>0; numHops>0
	public FrogSimulation(int dist, int numHops){
		goalDistance = dist;
		maxHops = numHops;
	}
	//returns an integer representing the distance, in inches, to be moved when the frog hops.
	private int hopDistance(){ //returns whatever number is inputted
		return sc.nextInt();
	}
	//Simulates a drog attempting to reach the goal as described in part a.
	//Returns true if the frog successfully reached or passed the goal during the simulation;
	//		  false otherwise.
	public boolean simulate(){
		int frogpos = 0;
		int hopsremain = maxHops;
		while (frogpos<goalDistance&&hopsremain>0){
			frogpos+=hopDistance();
			if (frogpos<0) return false;
			hopsremain--;
		}
		if (frogpos<goalDistance) return false;
		return true;
	}
		/* 
		What collegeboard wants:
		public boolean simulate(){
			int position = 0;
			for (int count=0;count<maxHops;count++){
				position+=hopDistance();
				if (position>=goalDistance){
					return true
				}
				else if (position < 0){
					return false;
				}
			}
			return false;
		}
		*/
	//Runs num simulations and returns the proportion of simulations in which the frog
	//sucfessfylly reached or passed the goal
	//Precondition: num>0
	public double runSimulations (int num){
		int trueruns = 0;
		for (int i=1;i<=num;i++){
			if (simulate()) trueruns++;
		}
		return (double)(trueruns/num);
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the distance the frog needs to travel and the maximum number of hops: ");
		int distance = console.nextInt();
		int maxh = console.nextInt();
		FrogSimulation frog = new FrogSimulation(distance,maxh);
		for (int i=0;i<maxh;i++) frog.hopDistance();
		System.out.println(frog.simulate());
		System.out.println("Enter the num for runSimulations(): ");
		System.out.println(frog.runSimulations(console.nextInt()));
	}
}
