/*
Implement class StudentAdvanceTicket to represent tickets purchased in advance by students.
A student advance ticket is constructed with a ticket number and with the number of
days in advance that the ticket was purchased. Student advance tickets cost half the
normal advance ticket price. A student advance ticket is printed with this format:
"Number: 17,Price: 15.0 (ID required)".
*/
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
