import java.util.*;
public class DPointersNoComments {
	public static void main(String[] args) {
		System.out.println();
		MyPointer p1 = new MyPointer();
		System.out.println("MyPointer p1 = " + p1);

		MyPointer p2 = p1;
		System.out.println("MyPointer p2 = " + p2);
		System.out.println("MyPointer p2 == MyPointer p1? " + (p2 ==p1));
		MyPointer p3 = new MyPointer();
		System.out.println("MyPointer p3 = " + p3);

		//string class has a built in tostring method
		System.out.println();
		String s1 = new String();
		System.out.println("String s1= "+ 'x' + s1 + 'x');
		System.out.println();

		String s5 = new String("yes");
		if (s5 == "yes"){
			System.out.println("yessir");
		}
		if (s5.equals("yes")){
			System.out.println("yes maam");
		}

		String s6 = "yes";
		if (s6 == "yes") {
			System.out.println("yessiree");	
		}
		System.out.println();
	}
}
class MyPointer {
	public MyPointer(){
	}
}
