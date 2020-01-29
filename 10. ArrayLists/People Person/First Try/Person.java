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
	/*public String printthing(ArrayList<String> namearray, ArrayList<Integer> agearray, ArrayList<Double> weightarray){
		String finalstring = "";
		for (int i = 0;i<agearray.size();i++ ) {
			finalstring += namearray.get(i)+" "+agearray.get(i)+" "+weightarray.get(i)+"\n";
		}
		return finalstring;
	}*/
	public String printinfo(){
		String finalstring = "";
		finalstring = this.name+" "+this.age+" "+this.weight+"\n";
		return finalstring;
	}
}
