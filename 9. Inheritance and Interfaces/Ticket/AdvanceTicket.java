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
