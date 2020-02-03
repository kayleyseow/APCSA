import java.util.*;
public class RemoveInRangeSplit{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("\nPlease enter an alphabetical sequence of strings separated\n"+ "by spaces. The end of the sequence must be signified using\n"+ "the sentinel value lastString, followed by a return.\n\n");
		String input = console.nextLine();
		String[] tempArr = input.split(" ");
		ArrayList<String> inputs = new ArrayList<String>();
		for (int i = 0; i < tempArr.length; i++){
			if (tempArr[i].equals("lastString")){
				break;
			}
			inputs.add(tempArr[i]);
		}
		System.out.println("Your original list: " + inputs.toString());
		System.out.println("\nNow please enter your start String\n");
		String begin = console.nextLine();
		System.out.println("Finally, please enter your end String\n");
		String end = console.nextLine();
		ArrayList<String> reduced = new ArrayList<String>();
		for (int i = 0; i < inputs.size(); i++){
			String current = inputs.get(i);
			if (current.compareTo(begin) < 0){
				reduced.add(current);
			}
			else if (current.compareTo(end) > 0){
				reduced.add(current);
			}
		}
		System.out.print("Your reduced list: " + reduced.toString() + "\n");
	}	
}
