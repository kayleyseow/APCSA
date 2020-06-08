//from 2012 APCS exam, Q3
/*
Consider a software system that models a horse barn. Classes that represent horses implement the following interface.
A horse barn consists of N numbered spaces. Each space can hold at most one horse. The spaces are indexed starting from 0; the index of the last space is N – 1. No two horses in the barn have the same name.
The declaration of the HorseBarn class is shown below. You will write two unrelated methods of the HorseBarn class.
a.
Write the HorseBarn method findHorseSpace. This method returns the index of the space in which the horse with the specified name is located. If there is no horse with the specified name in the barn, the method returns -1.
b. 
Write the HorseBarn method consolidate. This method consolidates the barn by moving horses so that the horses are in adjacent spaces, starting at index 0, with no empty spaces between any two horses. After the barn is consolidated, the horses are in the same order as they were before the consolidation.
*/
public interface Horse{
	String getName();
	int getWeight();
}
public class HorseBarn{
	private Horse[] spaces;
	//Returns the index of the space that contains the horse with the specified name.
	//Precondition: No two horses in the barn have the same name.
	//param = name of horse to be found
	//return the index of the space containing horse w/ name, -1 if there is no horse
	public int findHorseSpace(String name){
		for (int i=0;i<spaces.length;i++){
			if (spaces[i].getName().equals(name)) return i;
		}
		return -1;
	}
	//Consolidates barn by moving horses to that the horses are in adjacent spaces
	//starting at index 9, with no empty space between any two horses
	//Postcondition: The order of the horses is the same as before the consolidation.
	public void consolidate(){
		Horse[] newspaces = new Horse[spaces.length];
		int index = 0;
		for (int i=0;i<spaces.length;i++){
			if (spaces[i]!=null){
				newspaces[index] = spaces[i];
				index++;
			} 
		}
		spaces = newspaces;
	}
}
