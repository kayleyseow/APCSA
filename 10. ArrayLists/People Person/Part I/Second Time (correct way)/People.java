/*
Write a program People which reads an input of lines, where each line contains a name (String),
an age (int), and a weight (double), until it reaches a line that contains only the string "stop".
You can safely assume that there will be at least one line of input before the "stop" string.
The program should then store the data in in an ArrayList called People, where each element of
the ArrayList is an Object containing a name, age, and weight. Always add new Objects to the end
of the ArrayList. 
You'll need to create a separate class called Person with appropriate private variables. You'll
need set and get functions for each variable. The program should loop through the elements of
People and print out the contents of each element separated by a space - yes, it will almost
look exactly like the input!
HOWEVER - Don't take the shortcut of simply redirecting the input to the console output! Why not?
Doing this program correctly will make your life easier when doing Part II of this assignment.
*/
import java.util.*;
public class People {
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
        for(Person person : people){
            System.out.println(person.getName()+ " "+ person.getAge()+" "+ person.getWeight());
        }
    }
}
