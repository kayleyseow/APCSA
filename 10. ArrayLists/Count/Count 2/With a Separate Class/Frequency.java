//to be used with Count2 file
import java.util.*;
public class Frequency implements Comparable<Frequency>{
	private int priority;
	private String str;
	private int freq;
	public Frequency(int priority, String str, int freq){
		this.priority  = priority;
		this.str=str;
		this.freq=freq;
	}
	public int compareTo(Frequency f2){
		if (freq != f2.freq) {
			return freq-f2.freq;
		}
		else{
			return priority = f2.priority;
		}
	}
	public void setPriority (int priority){
		this.priority = priority;
	}
	public void setString (String str){
		this.str = str;
	}
	public void setFreq (int freq){
		this.freq = freq;
	}
	public int getPriority (){
		return priority;
	}
	public String getString (){
		return str;
	}
	public int getFreq (){
		return freq;
	}
}
