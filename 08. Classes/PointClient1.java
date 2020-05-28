/*
Point 1
Enhance your Point class to include:
    A constructor     //that takes in two arguments, Point(x,y);
	translate method  //produces and returns the translated coordinates (change in x, change in y)
	getX, getY        //gets the points
	setXY(x,y)        //sets the points
*/
public class PointClient{
    public static void main(String[] args){
        Point moo = new Point(3,3);
        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
        System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");
    }
}
