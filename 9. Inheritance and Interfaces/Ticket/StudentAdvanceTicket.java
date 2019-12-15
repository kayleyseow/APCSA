public class StudentAdvanceTicket extends AdvanceTicket{
	double satprice;
    int diasat;
    int numsat;
    public StudentAdvanceTicket(int number,int days){
    	super(number, days);
        this.diasat=days;
        this.numsat=number;
    }

}
