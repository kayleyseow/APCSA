/*
Implement class AdvanceTicket to represent tickets purchased in advance.
An advance ticket is constructed with a ticket number and with the number of days
in advance that the ticket was purchased. Advance tickets purchased 10 or more
days before the event cost $30, and advance tickets purchased fewer than 10 days
before the event cost $40.
*/
public class AdvanceTicket extends Ticket{
    double atprice;
    int dia;
    public AdvanceTicket(int number,int days){
    	super(number);
        this.dia = days;
        if(days>=10){
            this.atprice = 30;
        }
        else{
            this.atprice = 40;
        }
    }
    public int getNumber(){
        return this.dia;
    }
    public double getPrice(){
        return this.atprice;
    }
    public String toString(){
    	return "Number: " +super.getNumber()+ ", "+"Price: " + Double.toString(this.atprice);
    }
}
