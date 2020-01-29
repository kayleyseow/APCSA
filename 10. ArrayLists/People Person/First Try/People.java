import java.util.*;
public class People{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<String> namearraylist = new ArrayList<String>();
        String nameinput = "";
        ArrayList<Integer> agearraylist = new ArrayList<Integer>();
        int ageinput;
        ArrayList<Double> weightarraylist = new ArrayList<Double>();
        double weightinput;
        for(;;){// an infinite loop until break
            nameinput = console.next();
            if(nameinput.equals("stop")){
                break;
            }
            namearraylist.add(nameinput);
            ageinput = console.nextInt();
            agearraylist.add(ageinput);
            weightinput = console.nextDouble();
            weightarraylist.add(weightinput);
        }
        //System.out.println(namearraylist);
        //System.out.println(agearraylist);
        //System.out.println(weightarraylist);      
        //Person printperson = new Person.printthing(namearraylist,agearraylist, weightarraylist);
        for (int i = 0;i<agearraylist.size();i++ ) {
            Person temporary = new Person(namearraylist.get(i),agearraylist.get(i), weightarraylist.get(i));
            System.out.print(temporary.printinfo());
        }
    }
}
