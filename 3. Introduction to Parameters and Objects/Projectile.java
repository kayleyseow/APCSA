//this program computes the trajectory of a projectile
 import java.util.*; // for Scanner 
 public class Projectile {
 	// constant for Earth accel in meters/second^2  
      public static void main(String[] args) {

      	Scanner console = new Scanner(System.in); 
      	System.out.println("This program computes the"); 
      	System.out.println("trajectory of a projectile given"); 
      	System.out.println("its initial velocity and its"); 
      	System.out.println("angle relative to the"); 
      	System.out.println("horizontal."); 
      	System.out.println(); 

      	System.out.print("velocity (meters/second)? "); 
      	double velocity = console.nextDouble(); 
      	System.out.print("angle (degrees)? "); 
      	double angle = Math.toRadians(console.nextDouble());
      	System.out.print("number of steps to display? "); 
      	int steps = console.nextInt(); 
      	System.out.println(); 

      	double accel = -9.81;
      	double xVelocity = velocity * Math.cos(angle); 
      	double yVelocity = velocity * Math.sin(angle); 
      	double totalTime =(yVelocity / accel) *  -2.0 ;
      	double timeIncrement = totalTime / steps; 
      	double xIncrement = xVelocity * timeIncrement; 

      	double x = 0.0; 
      	double y = 0.0; 
      	double t = 0.0; 
      	System.out.println("step\tx\ty\ttime"); 
      	System.out.println("0\t0.0\t0.0\t0.0"); 
      	for (int i = 1; i <= steps ; i++ ) {
      		t += timeIncrement;
      		x += xIncrement;
      		y= yVelocity * t + 0.5 * accel * t * t;
      		System.out.println(i + "\t" + round2(x) + "\t" + round2 (y) + "\t" + round2(t));
      	}
      } 
      public static double round2 (double n) {
      	return Math.round(n*100.0) / 100.0;
      }
 }    
