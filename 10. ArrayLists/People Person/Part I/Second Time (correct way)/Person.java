import java.util.*;
public class Person {
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
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public double getWeight() {return this.weight;}
}
