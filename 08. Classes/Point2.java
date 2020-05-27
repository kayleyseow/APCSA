//Point.java
public class Point{
    //fields are declared just like variables
    // The scope of a field is the entire class
    int x;
    int y;
    // construct a new point with the given (x,y) location
    public Point(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }
    //construct a new point with (x,y) = (0,0)
    public Point(){ // fields are given default values of 0
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
//Start the Point2 assignment
    public String toString() { //returns the wanted string
        return ("(" + x + ", " + y + ")");
    }
    public int getQuadrant() { //returns which quardrant the point belongs to, or 0 if the point is on an axis
        if(x>0){
            if (y>0) {
                return 1;
            }
            else if (y<0){
                return 4;
            }
            else {
                return 0;
            }
        }
        else if (x<0){
            if (y>0) {
                return 2;
            }
            else if (y<0){
                return 3;
            }    
            else{
                return 0;
            }        
        }
        else {
            return 0;
        }
    }
    public double distanceToOrigin(){ //returns distance from (x, y) to origin (use double)
        return Math.sqrt(x*x + y*y);
    }
}
