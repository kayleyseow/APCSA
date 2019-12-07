/*
Point3
Enhance your Point class to include these methods:
	toString			// produces and returns the desired string, e.g (19, 5)
	getQuadrant			// returns the quadrant in which (x, y) lies (or 0 if on axis)
	distanceToOrigin	// returns distance from (x, y) to origin (double)
	slope               // returns the slope between two points (double)
*/
import java.util.*;

public class PointClient{
    public static void main(String[] args){

    	Scanner console = new Scanner(System.in);
		int x = getNumber("Enter x-value: ", console);
		int y = getNumber("Enter y-value: ", console);

        Point moo = new Point(x,y);
		moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
		System.out.println("moo = " + moo.toString());
		System.out.println("Quadrant: " + moo.getQuadrant());
		System.out.println("Distance to origin: " + moo.distanceToOrigin());

		//moo.setXY(1,2);
		Point other = new Point(137,4);
		System.out.println("slope = " + moo.slope(other));
	}

	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}

}
