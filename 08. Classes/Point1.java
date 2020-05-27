//Point.java
public class Point1{
	//fields are declared just like variables
	// The scope of a field is the entire class
	int x;
	int y;
	// construct a new point with the given (x,y) location
	public Point1(int initialX, int initialY){
		x = initialX;
		y = initialY;
	}
	//construct a new point with (x,y) = (0,0)
	public Point1(){ // fields are given default values of 0
		x=0;
		y=0;
	}
	//shift the point's location by the given amount
	public void translate (int dx, int dy){
		x+=dx;
		y+=dy;
	}
	//return the point's x-value
	public int getX(){
		return x;
	}
	//return the point's y-value
	public int getY(){
		return y;
	}
	//set the point's x and y values to the given values
	public void setXY(int setX,int setY){
		x = setX;
		y = setY;
	}
}
