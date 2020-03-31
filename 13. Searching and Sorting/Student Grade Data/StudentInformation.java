import java.util.*; 
import java.io.*; 
public class StudentInformation{//formats the data
    public String firstname;
    public String lastname; 
    public int id;
    public double p;
    public String grd; 
    public StudentInformation(String input) {
        String[] info = input.split("\\s+");
        this.lastname = info[0]; 
        this.firstname = info[1]; 
        this.id = Integer.parseInt(info[2]);
        this.p = Double.parseDouble(info[3]); 
        this.grd = info[4];
    }
    public String toString(){
        return String.format("%-10s%-14s%06d   %5.1f     %s", lastname, firstname, id, p, grd);
    }
} 
  
