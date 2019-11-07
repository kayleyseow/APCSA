//shows how numbers truncate in java
public class CentsTruncate{
	public static void main(String[] args) {
		double cost = 4.35;

		int centsTruncate = (int)(100 * cost);
		System.out.println("centsTruncate = " + centsTruncate);

		int centsRound = (int)(100 * cost + 0.5);
		System.out.println("centsRound =" + centsRound);
	}
}
