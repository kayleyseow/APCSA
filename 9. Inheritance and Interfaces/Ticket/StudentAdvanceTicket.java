
public class StudentAdvanceTicket extends AdvanceTicket{
	double satprice;
    int diasat;
    int numsat;
    public StudentAdvanceTicket(int number,int days){
    	super(number, days);
        this.diasat=days;
        this.numsat=number;
    }
    public int getNumber(){
    	return super.dia;
    }
    public double getPrice(){
    	return super.getPrice()/2;
    }
    public String toString(){
    	return "Number: "+  this.numsat+ ", Price: " + Double.toString(this.getPrice()) + " (ID required)";
    }
}
