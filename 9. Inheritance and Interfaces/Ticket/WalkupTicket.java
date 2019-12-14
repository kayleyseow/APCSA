public class WalkupTicket extends Ticket{
	private int wtprice = 50;
	public WalkupTicket(int number){
		super(number);
	}
	public double getPrice(){
		return wtprice;
	}

	public String toString(){
		//return Double.toString(wtprice);
		return "Number: " +super.getNumber()+ ", "+"Price: " + Double.toString(wtprice);
	}
}
