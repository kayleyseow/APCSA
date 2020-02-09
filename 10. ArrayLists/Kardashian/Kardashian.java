
public class Kardashian implements Comparable<Kardashian>{
	public String name;
	public int eyebrowLength;
	public double nailLength;

	@Override
	public int compareTo(Kardashian other){
		if (!this.name.equals(other.getName())){
			return this.name.compareTo(other.getName());
		}
		if (this.eyebrowLength != other.getEyebrowLength()){
			return this.eyebrowLength - other.getEyebrowLength();
		}
		Double thisNail = new Double (this.nailLength);
		Double otherNail = new Double (other.getNailLength());
		return thisNail.compareTo(otherNail);
	}
}