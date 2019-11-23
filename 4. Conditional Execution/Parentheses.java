import java.util.*;
public class Parentheses{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your string below:");
		String parenthesis= console.next();
		int length = parenthesis.length();
		int valley = 0;
		int highest = 0;
		for (int i=0;i<length ;i++ ) {
			if (valley<0) {
				System.out.println("false");
				break;
			}
			if ((int)parenthesis.charAt(i) == 40){
				valley++;
				if (valley>highest) {
					highest=valley;
				}
			}
			else if ((int)parenthesis.charAt(i) == 41) {
				valley--;
			}
		}
		if (valley == 0) {
			System.out.println("true");
			System.out.println(highest);	
		}
		else if (valley>0){
			System.out.println("false");
		}
   	}
}
