public abstract class Ticket {
  private int number;
  //implement field and constructor
	public Ticket(int number){
		this.number = number;
	}
	public int getNumber(){
		return this.number;
	}
    public abstract double getPrice();
    //implement toString method
    //public String toString(){
    public abstract String toString();
    //return "Number: " + Integer.toString(number)+", ";

}
