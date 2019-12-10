public class Point {
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

}
