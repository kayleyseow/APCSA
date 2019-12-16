/*
Demonstrates Polymorphism at a more complex level in
method1() call from class E.:
	When called from class E, output is G1.
	When called from class H, output is H1.
*/
public class GFEHClient{
	public static void main(String[] args){
		G[] elements = {new G(), new F(), new E(), new H()};
		for (int i = 0; i < elements.length; i++){
			System.out.println(elements[i]);
			elements[i].method1();
			elements[i].method2();
			System.out.println();
		}
	}
}
/*
Output:

G
G 1
G 2

F
G 1
F 2
G 2

F
G 1
E 2
G 1

F
H 1
E 2
H 1

*/
