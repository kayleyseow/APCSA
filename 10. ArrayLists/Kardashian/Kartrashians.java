public class Kartrashians implements Comparable<Kartrashians>{
	public String name;
	public int eyebrowLength;
	public double nailLength;
	public Kartrashians (String name, int eyebrowLength, double nailLength){
		this.name = name;
		this.eyebrowLength = eyebrowLength;
		this.nailLength = nailLength;
	}
	public int compareTo(Kartrashians other){
		int compare = this.name.compareTo(other.name);
		if(compare==0){
			if (this.eyebrowLength==other.eyebrowLength) {
				if (this.nailLength==other.nailLength) {
					return 0;
				}
				else if(this.nailLength>other.nailLength){
					return 1;
				}
				else{
					return -1;
				}
			}
			else if (this.eyebrowLength>other.eyebrowLength) {
				return 1;
			}
			else{
				return -1;
			}
		}
		return compare;
	}
	public void setname (String name){
		this.name = name;
	}
	public void seteyebrowLength (int eyebrowLength  ){
		this.eyebrowLength =eyebrowLength ;
	}
	public void setnailLength ( double nailLength ){
		this.nailLength = nailLength;
	}
	public String getname (){
		return name;
	}
	public int geteyebrowLength (){
		return eyebrowLength;
	}
	public double getnailLength(){
		return nailLength;
	}
	public String toString(){
		return name + ", " + eyebrowLength + ", " + nailLength;
	}
}
