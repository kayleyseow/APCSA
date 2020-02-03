import java.util.*;
public class Count2{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Frequency> fList = new ArrayList<Frequency>();
		Scanner console = new Scanner (System.in);
		getList(list, fList, console);
		Collections.sort(fList);
		printFreq(fList);
	}
	public static void getList (ArrayList<String> list, ArrayList<Frequency> fList, Scanner console){
		System.out.print("\nPlease enter a sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n\n");
		String str = console.next();
		int priority = 0;
		while(!str.equals("lastString")){
			if (!list.contains(str)) {
				list.add(str);
				fList.add(new Frequency(priority,str, 1));
				priority++;
			}
			else{
				int index = 0;
				for(int i = 0; i<fList.size(); i++){
					if (fList.get(i).getString().equals(str)) {
						index = i;
					}
				}
				fList.add(new Frequency(fList.get(index).getPriority(), str, (fList.get(index).getFreq()+1)));
				fList.remove(index);
			}
		}
	}
	public static void printFreq(ArrayList<Frequency> fList){
		for(Frequency f: fList){
			System.out.println(f.getString()+" "+ f.getFreq());
		}
	}
}
