//from 2014 APCS practice exam
/*
A school district would like to get some statistics on its students’ standardized test scores. Scores will be represented as objects of the following ScoreInfo class. Each ScoreInfo object contains a score value and the number of students who earned that score.
The following Stats class creates and maintains a database of student score information. The scores are stored in sorted order in the database.
a. 
Write the Stats method record that takes a test score and records that score in the database. If the score already exists in the database, the frequency of that score is updated. If the score does not exist in the database, a new ScoreInfo object is created and inserted in the appropriate position so that the database is maintained in increasing score order. The method returns true if a new ScoreInfo object was added to the database; otherwise, it returns false.
b. 
Write the Stats method recordScores that takes an array of test scores and records them in the database. The database contains at most one ScoreInfo object per unique score value. Each ScoreInfo object contains a score and an associated frequency. The database is maintained in increasing order based on the score.
In writing recordScores, assume that record works as specified, regardless of what you wrote in part (a).
*/
public class Stats{
	private ArrayList<ScoreInfo> scoreList;
	public boolean record(int score){
		for (int i=0;i<scoreList.size();i++){
			ScoreInfo info = scoreList.get(i);
			if (info.getScore()==score){
				info.increment();
				return false;
			}
			else if (info.getScore()>score){
				scoreList.add(i,new ScoreInfo(score));
				return true;
			}
		}
		scoreList.add(new ScoreInfo(score));
		//Collections.sort(scoreList);
		return true;
	}
	public void recordScores (int[] stuScores){
		for (int i=0;i<stuScores.length;i++){
			record(stuScores[i]);
		}
	}
	/*
	Write the method header for the getSeniorPercent method.
		public double getSeniorPercent (ArrayList<ScoreInfo> studentsscores){}
	Identify within ScoreInfo any new or modified variables, constructors, or methods. Do not write the program code for this change.
		add a 
	We will need to add a new private instance variable to ScoreInfo in order to record the number of seniors called numSeniors. The constructor of ScoreInfo could also be modified to accept a Boolean to see if the student is a senior or not. Therefore, if it was true, then numSeniors would be incremented. 

	*/
}
