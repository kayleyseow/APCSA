import java.util.*;
public class Person{
	private String name;
	private int age;
	private double weight;
	public Person (String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getname() {return this.name;}
	public int getage() {return this.age;}
	public double getweight() {return this.weight;}
	public String printinfo(){
		String finalstring = "";
		finalstring = this.name+" "+this.age+" "+this.weight+"\n";
		return finalstring;
	}
}
