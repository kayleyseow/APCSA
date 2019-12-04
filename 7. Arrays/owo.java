import java.util.*;
public class owo{
	public static void main(String[] args) {
		boolean[] chararray = new boolean[]{false, false, true, true};
		System.out.println(owo(chararray));
	}
	public static char[] owo(boolean[] array){
		char[] owo = new char [array.length];
		for (int i = 0;i<array.length ;i++ ) {
			if (array[i]) {
				owo[i] = 'o';
			}else{
				owo[i]='w';
			}
		}
		return owo;
	}
}	
