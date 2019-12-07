/*
Point 2
Enhance your Point class to include:
	toString method		//produces and returns the desired string, e.g (19, 5)
	getQuadrant method	//returns the quadrant in which (x, y) lies (or 0 if on axis)
	distanceToOrigin	//returns distance from (x, y) to origin (use double)
*/
import java.util.*;
public class PointClient{
    public static void main(String[] args){
    	Point mooDefault = new Point();
		System.out.println("mooDefault = " + mooDefault);
    	Scanner console = new Scanner(System.in);
		int x = getNumber("Enter x-value: ", console);
		int y = getNumber("Enter y-value: ", console);
        Point moo = new Point(x,y);
        System.out.println("moo = " + moo);
        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
		System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");
		System.out.println("Quadrant: " + moo.getQuadrant());
		System.out.println("Distance to origin: " + moo.distanceToOrigin());
		System.out.println("x = " + x); //prints PointClient x (variable in PointClient scope)
		System.out.println("x = " + moo.getX()); //prints Point x (field in Point scope)
		System.out.println("moo = " + moo); //the toString method is implicitly called
		System.out.println("moo = " + moo.toString()); // produces same output as line above
	}
	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}
}
