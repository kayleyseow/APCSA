//from 2005 APCS exam, Q4
/*
Consider a grade-averaging scheme in which the final average of a student’s scores is computed differently from the traditional average if the scores have "improved." Scores have improved if each score is greater than or equal to the previous score. The final average of the scores is computed as follows.
A student has n scores indexed from 0 to n-1. If the scores have improved, only those scores with indexes greater than or equal to n/2 are averaged. If the scores have not improved, all the scores are averaged.
Consider the following incomplete StudentRecord class declaration. Each StudentRecord object stores a list of that student’s scores and contains methods to compute that student’s final average.
a. 
Write the StudentRecord method average. This method returns the average of the values in scores given a starting and an ending index.
b. 
Write the StudentRecord method hasImproved.
c.
Write the StudentRecord method finalAverage.
In writing finalAverage, you must call the methods defined in parts (a) and (b). Assume that these methods work as specified, regardless of what you wrote in parts (a) and (b).
\
*/
public class StudentRecord{
	private int[] scores;
	private double average (int first, int last){
		int sum = 0;
		for (int i=first;i<=last;i++){
			sum+=scores[i];
		}
		return (double)sum /(last-first+1);
	}
	private boolean hasImproved(){
		for (int i=0;i<scores.length-1;i++){
			if (scores[i]>scores[i+1]) return false;
		}
		return true;
	}
	public double finalAverage(){
		if (hasImproved()){
			return average(scores.length/2,scores.length-1);
		}
		return average(0, scores.length-1);
	}
}
