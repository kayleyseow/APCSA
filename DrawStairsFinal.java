public class DrawStairsFinal{
	public static final int TOTAL_STAIRS = 7;
	public static final String SPACE = ("     ");

    
    public static void main(String[] args){
    	System.out.print("Enter number of terms: ");
		Scanner console = new Scanner(System.in);
		int numberOfTerms = console.nextInt();
		for (int s = 1; s <= TOTAL_STAIRS; s++){
			// Draw Head
			for (int i=0; i<(TOTAL_STAIRS-s) ; i++){
				System.out.print (SPACE);
			}
			System.out.print(" o  ******");
			for (int i=1; i < s; i++){
				System.out.print (SPACE);
			}
			System.out.println ("*");
			
			//Draw Hand
			for (int i=0; i<(TOTAL_STAIRS-s) ; i++){
				System.out.print (SPACE);
			}
			System.out.print("/|\\ *     ");
			for (int i=1; i < s; i++){
				System.out.print (SPACE);
			}
			System.out.println ("*");
			
			//Draw Leg
			for (int i=0; i<(TOTAL_STAIRS-s) ; i++){
				System.out.print (SPACE);
			}
			System.out.print("/ \\ *     ");
			for (int i=1; i < s; i++){
				System.out.print (SPACE);
			}
			System.out.println ("*");
		}
		for (int i=0; i<=TOTAL_STAIRS; i++ ){
			System.out.print("*****");

		}
		System.out.println("*");

	}	

}