public class CheckerBoard{
	public static void main(String[] args) {
		for (int i = -45;i < 5 ; i++ ) {
			for (int j= 100; j < 150 ; j++ ) {
				System.out.print((i+j)%2);				
			}
			System.out.println();
		}
	}
}