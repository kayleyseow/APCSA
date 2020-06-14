//from the 2020 exam sample questions, Q1 (Array/ArrayList)
public class OnlinePurchaseManager{
	/** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
	private ArrayList<Gizmo> purchases;
	/* Returns the number of purchased Gizmo objects that are electronic and are manufactured by maker, as described in part (a).*/
	public int countElectronicsByMaker(String maker){
		int count = 0;
		for (int i=0;i<purchases.size();i++){
			if(purchases.get(i).getMaker().equals(maker)&&purchases.get(i).isElectronic()) count++;
		}
		return count;
	}
	/* Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and false otherwise, as described in part (b).*/
	public boolean hasAdjacentEqualPair(){
		int temp = 0;
		if (purchases.size()<2) return false;
		for (int i=0;i<purchases.size()-1;i++){
			if (purchases.get(i).equals(purchases.get(i+1))) temp++;
		}
		return temp>0;
	}
	/*A programmer would like to add a method getCheapestGizmoByMaker, which returns the least expensive Gizmo purchased by an individual from a given maker. Write a description of how you would change the Gizmo and OnlinePurchaseManager classes in order to support this modification.*/
}	//The method header would be public Gizmo getCheapestGizmoByMaker(String maker). I would first add a getPrice method to Gizmo in order to get the price. I would also change the parameter of the constructor of Gizmo. Then, in the getCheapestGizmoByMaker method, I would first create a double, named cheapest and set it to the price of the first value in the ArrayList, then an int index to receive the value of the index of the object with the cheapest Gizmo. Then, I will create a forloop to traverse the arraylist, using an if statement to check if the object at the current index has the same maker and if the price at the object at the index is lower than cheapest. If it is true, then I will set cheapest to the price of the object at the current index, and then set the int index to the current index of the ArrayList. I will then return the object at the specified index of purchases.
