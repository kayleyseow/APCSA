public class GSOTpyramid{
	public static void main(String[] args) {
		int Height = 3;
		int row = 0;
		int pyramid = Height -1;
        String str1 = "\\------/";
        String str2 = "\\GSOT/";
        String str3 = "\\  /";
        String str4 = "\\/";
        String str5 = "   ";

        for (int l = 0; l <= Height; l++) {
        	for (int space = 0;space<l ;space++ ) {
        		System.out.print("    ");
        		
        	}
        	//print row 1
	        row = 0;
	        for (int i = 0; i <= pyramid;i++ ) {
	            

	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	            System.out.print(str1);
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	        }
	        System.out.println("");
	        row++;
	        //print row 2
	        for (int space = 0;space<l ;space++ ) {
        		System.out.print("    ");
        		
        	}
	        for (int i = 0; i <= pyramid;i++ ) {
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	            System.out.print(str2);
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	        }
	        System.out.println("");
	        row++;
	        //print row 3
	        for (int space = 0;space<l ;space++ ) {
        		System.out.print("    ");
        		
        	}
	        for (int i = 0; i <= pyramid;i++ ) {
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	            System.out.print(str3);
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	        }
	        System.out.println("");
	        row++;
	        //print row 4
	        for (int space = 0;space<l ;space++ ) {
        		System.out.print("    ");
        		
        	}
	        for (int i = 0; i <= pyramid;i++ ) {
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	            System.out.print(str4);
	            for ( int j = 0;j < row ;j++ ) {
	            	System.out.print(" ");
	            }
	        }
	        System.out.println("");
	         pyramid --;  
	    }



    }  
  }