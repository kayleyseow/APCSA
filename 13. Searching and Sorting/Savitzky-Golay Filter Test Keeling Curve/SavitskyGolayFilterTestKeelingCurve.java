/*
			SAVITZKY-GOLAY DIGITAL DERIVATIVE APPLIED TO KEELING CURVE
Apply a Savitzky-Golay differentiation filter to the analysis of the Keeling Curve.
Your goal is to reveal the rate of change of CO2 accumulation in the atmosphere over
time. One particular event of interest is the 1991 eruption of Mt. Pinatubo in the
Philippines, which impacted the global climate for several years. In particular, it left
its signature on the Keeling curve, namely a short-lived but significant decrease in
the rate of change.

This slope change, subtle and easily overlooked in the raw data, lends itself to analysis
using your Savitzky-Golay differentiation program. It is suggested that you make a
copy of your SavitzkyGolayFilterTest program and rename it SavitzkyGolayFilterKeeling.
Your new program will use all the features of your test program, with the additional
feature of a moving average to eliminate the seasonal variation in CO2 concentration.

The Keeling Curve input data will be provided to you in a text file, KeelingDataSavGol.txt,
which will replace your ParabolaPlusGaussian.txt file as input to your program.
The first data point, 315.71, is for March, 1958, followed by monthly readings
through 2016, for a total of 697 data points (missing points in the original data set
have been filled in with interpolated values). As before, include tic marks for time on
your horizontal axis, one tic mark every two years starting in 1960.

In order that your plot fills up your 800 x 400 panel, subtract 310 from all data points
and scale by a factor of 4. As before, with your origin at (0, 399) your plot should nicely
fill your panel.

Since we are interested in the slope change over a multi-year period, it will be
helpful to first create a trend line free of the seasonal slope variations in the raw
Keeling Curve data. This can be done using a moving average, where each data point is
replaced with the average over a window of time centered about the given month.

Allow the user to input the width of this window in months. Experiment with the number of
months needed to produces a smooth trend line. Hint - since the seasonal variations in the
Keeling Curve have a periodicity of one year, consider multiples of 12 months for your
smoothing window. Be careful not to over-smooth a short time trend spanning only a few
years, such as the Mt. Pinatubo feature.

As before, to avoid array-out-of-bounds complications at the beginning and end of your data,
either when finding the moving average or when filtering, simply iterate over a range
which stays a "safe" distance from the endpoints of your plot, i.e. at least half the width
of your moving average or filter. Leaving a few points un-smoothed and/or unfiltered at
either end of your plot will have little or no effect on inboard points.

The first derivative of your smoothed data using, for example, filter 8, should then show
a pronounced slope change in the time period corresponding to Mt. Pinatubo. As before, scale
your differentiated data by a factor of 4 for better visualization.
*/
import java.util.*;
import java.awt.*; 
import java.io.*;
//ok gameplan:1.print Keeling curve (play with scale),2.average trend line (user input window),3.filter the moving average trend line
public class SavitskyGolayFilterTestKeelingCurve{
	public static void main(String[] args) throws FileNotFoundException{
		DrawingPanel panel = new DrawingPanel(800, 400);
		Graphics g = panel.getGraphics();
    		//automatically gets the data from "KeelingDataSavGol.txt"
		Scanner console = new Scanner(new File("KeelingDataSavGol.txt"));
		ArrayList<Double> dalist = new ArrayList<Double>();
		//MLA header (not really)
		g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
		g.drawString("Kayley Seow", 4, 20);
		g.drawString("Mr. Brucker", 4, 38);
		g.drawString("APCS Period 3", 4, 56);
		//input the data for the Keeling Curve
		for (int i=0;i<697;i++) {
		 	int x=i;
		 	double y= console.nextDouble()-310;//-310 cause brucker said so
		    dalist.add(y);//a secret tool which will help us later! (arraylist for all the data points)
		    g.drawOval(x,((400-(4*(int)y))),1,1); //-400 or else it goes upside down, *4 inside to scale, 1 and 1 for a 1x1 pixel circle
		} 
		//draw the scale at the bottom
		for (int i=10; i<697; i+=24){
		    g.setFont(new Font("TimesRoman", Font.PLAIN, 8));
		    g.drawString(""+(1960+i/12),i,397);//397 to put the row at the bottom
		    g.drawLine(i,390,i,380);//draws the vertical tick marks at the bottom | <- that thing
		}  
		//prints out the moving average 
		g.setColor(Color.BLUE);
    		//get the user to input width of this window of time
		console= new Scanner(System.in); 
		System.out.println("Enter an integer for the width of the window (in months):");
		int window = console.nextInt();
		int w = window/2;//cause brucker said so
		double[] davg = new double[697-w];
		//works, prints out the smooth line
		for (int i=w;i<697-w;i++){
			double sum=0;
			for (int j = i-w;j<i+w;j++ ) {
				sum+=dalist.get(j);
			}
			double average = sum/(double)window;
			davg[i] = average;
			g.drawOval(i,((400-((int)(average*4)))),1,1);
     			//NOTE: MAKE SURE THAT YOU TYPECAST  A F T E R  MULTIPLYING IT BY 4 (IT CREATES THE SMOOTH LINE)
		}
		System.out.println("select Savitsky-Golay filter: ");
		System.out.println("smoothing");
		System.out.println(" quadratic or cubic");
		System.out.println("  0   {  0, 0,-3,12,17,12,-3, 0,  0}");
		System.out.println("  1   {  0,-2, 3, 6, 7, 6, 3,-2,  0}");
		System.out.println("  2   {-21,14,39,54,59,54,39,14,-21}");
		System.out.println(" quartic or quintic");
		System.out.println("  3   { 0,  5,-30, 75,131, 75,-30,  5, 0}");
		System.out.println("  4   {15,-55, 30,135,179,135, 30,-55,15}");
		System.out.println();
		System.out.println("1st derivative");
		System.out.println(" linear or quadratic");
		System.out.println("  5   { 0, 0, 0,-1,0,1,0,0,0}");
		System.out.println("  6   { 0, 0,-2,-1,0,1,2,0,0}");
		System.out.println("  7   { 0,-3,-2,-1,0,1,2,3,0}");
		System.out.println("  8   {-4,-3,-2,-1,0,1,2,3,4}");		
		System.out.println(" cubic or quartic");
		System.out.println("  9   { 0,   0,   1,  -8,0,  8, -1,  0,  0}");
		System.out.println("  10  { 0,  22, -67, -58,0, 58, 67,-22,  0}");
		System.out.println("  11  {86,-142,-193,-126,0,126,193,142,-86}");
		// select filter
		System.out.print("Enter an integer 0 - 11 corresponding to desired filter: \n");
		int filter = console.nextInt();
		//implementation of the filters
    		//input the coefficients into a 2D array
		int[][] c ={{0, 0, -3, 12, 17, 12, -3, 0, 0},{0, -2, 3, 6, 7, 6, 3, -2, 0},{-21, 14, 39, 54, 59, 54, 39, 14, -21},{ 0,  5,-30, 75,131, 75,-30, 5, 0},{15,-55, 30,135,179,135, 30,-55,15},{ 0, 0, 0,-1,0,1,0,0,0},{ 0, 0,-2,-1,0,1,2,0,0},{ 0,-3,-2,-1,0,1,2,3,0},{-4,-3,-2,-1,0,1,2,3,4},{ 0,0,1,-8,0,8,-1,0,0},{ 0,22, -67, -58,0, 58, 67,-22,  0},{86,-142,-193,-126,0,126,193,142,-86}};
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.BOLD, 16));
		g.drawString("Savitzky-Golay Digital Derivative with filter " + filter + ": ", 4, 80);
		g.setColor(Color.RED);
		for (int i=4;i<697-16;i++ ){//play around with the values for different filters so there is no out of bounds exception
      		//apply the filter to the moving average 
			double smoothing = 4*((c[filter][0]*davg[i-4])+(c[filter][1]*davg[i-3])+(c[filter][2]*davg[i-2])+(c[filter][3]*davg[i-1])+(c[filter][4]*davg[i])+(c[filter][5]*davg[i+1])+(c[filter][6]*davg[i+2])+(c[filter][7]*davg[i+3])+(c[filter][8]*davg[i+4]));
			g.drawOval(i,400-((int)(4.0*smoothing)),1,1);
		}
	}
}
