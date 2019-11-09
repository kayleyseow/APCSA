//Write a program that computes the spherical distance between two points on the surface of the Earth, given their latitudes and longitudes. This is a useful operation because it tells you how far apart two cities are if you multiply the distance by the radius of the Earth, which is roughly 6372.795 km. 
import java.util.*;
import java.lang.*;
public class SphericalDistanceBetweenTwoPoints{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program computes the spherical distance \nbetween two points, 1 and 2\n ");
		System.out.println("Please enter the latitude and longitude for \neachpoint as a pair of integers, degrees\nfollowed by minutes:\n ");
		System.out.print("latitude 1?");
		double LATITUDE1 = console.nextDouble();
		System.out.print("longitude 1?");
		double LONGITUDE1= console.nextDouble();
		System.out.print("latitude 2?");
		double LATITUDE2= console.nextDouble();		
		System.out.print("longitude 2?");
		double LONGITUDE2 = console.nextDouble();
		System.out.println(caldist(LATITUDE1, LONGITUDE1, LATITUDE2, LONGITUDE2));
	}
	public static double caldist(double lat1, double long1, double lat2, double long2){
		double difference = Math.toRadians(long2)-Math.toRadians(long1);
		double arccos = Math.acos((Math.sin(Math.toRadians(lat1))*Math.sin(Math.toRadians(lat2))+(Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2))*Math.cos(difference))))*6372.795;
		double rounded = Math.round(arccos*1000)/1000.00;
		return rounded;
	}
}
