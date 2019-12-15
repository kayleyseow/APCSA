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
    //public double getPrice();
    public double getPrice(){
        //System.out.println(super.getPrice());
        //this.satprice = super.getPrice();
    	return super.getPrice()/2;
    }

}
