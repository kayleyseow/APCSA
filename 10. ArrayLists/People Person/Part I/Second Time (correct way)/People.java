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
