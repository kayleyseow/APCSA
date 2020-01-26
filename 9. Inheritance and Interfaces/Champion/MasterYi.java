public class MasterYi extends Champion{
	String Skin;
	public MasterYi(int level, String power, String skin ){
		super(level,power);
		this.Skin = skin;
	}
	public String getSkin(){
		return Skin;
	}
}