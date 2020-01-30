//same Person.java file as the one in part I, but with added methods
//(the methods are toString() and compareTo()
import java.util.*;
//public class Person {
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private double weight;
	public Person (String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void setName (String name){
		this.name = name;
	}
	public void setAge (int age){
		this.age = age;
	}
	public void setWeight (double weight){
		this.weight = weight;
	}
	public int compareTo(Person person2){
		if (name.compareTo(person2.name)!=0) {
			//returns positive if this name comes after person2's name
			//returns negative if this name comes before person2's name
			return name.compareTo(person2.name);
		}
		else if (age !=person2.age) {
			return age-person2.age;
			//because this is what you want to have returned
		}
		else {
			//return the difference in weight
			return (int)(weight-person2.weight);
		}
	}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public double getWeight() {return this.weight;}
	public String toString(){
		return "{" + name + ", " + age + ", " + weight+ "}";
	}
}
