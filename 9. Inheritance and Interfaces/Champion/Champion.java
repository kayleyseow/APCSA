public class Champion{
	public int level;
	public String power;
	public Champion(int level, String power){
		this.level = level;
		this.power = power;
	}
	public void setLevel(){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	public String useQ(){
		return "Q used";
	}
	public void feed(){
		System.out.println("mid or feed");
	}
	public String toString(){
		return "Level "+level+" champion with "+power;
	}
}
