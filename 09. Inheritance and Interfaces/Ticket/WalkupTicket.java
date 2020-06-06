/*
Implement class WalkupTicket to represent a walk-up event ticket.
Walk-up tickets are also constructed by number, and they have a price of $50
*/
public class WalkupTicket extends Ticket{
	private int wtprice = 50;
	public WalkupTicket(int number){
		super(number);
	}
	public double getPrice(){
		return wtprice;
	}
	public String toString(){
		return "Number: " +super.getNumber()+ ", "+"Price: " + Double.toString(wtprice);
	}
}
