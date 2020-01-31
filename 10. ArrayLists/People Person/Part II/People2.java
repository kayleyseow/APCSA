/*In Part I of this assignment, you read in lines of information and stored the 
information in an ArrayList of Person objects. For this part of the assignment, your 
program needs to sort that ArrayList by implementing the Comparable interface 
and the compareTo function in your Person class. It then needs to print out the 
sorted ArrayList.  It must sort the Persons first by forward-alphabetical name, 
then by increasing age, then by increasing weight in that order. You will print the 
ArrayList in a different format from Part I. You will need to create a toString() 
method in your Person class to create the desired output.*/

import java.util.*;
public class People2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();
        String tempName;
        int tempAge;
        double tempWeight;
        tempName = console.next();
        while(tempName.compareTo("stop")!=0){
            tempAge = console.nextInt();
            tempWeight = console.nextDouble();
            Person p = new Person(tempName, tempAge, tempWeight);
            people.add(p);
            tempName = console.next();
        }
        System.out.println("Original list: ");
        System.out.println(people + "\n");
        Collections.sort(people);
        System.out.println("Sorted list: ");
        System.out.println(people);
    }
}
