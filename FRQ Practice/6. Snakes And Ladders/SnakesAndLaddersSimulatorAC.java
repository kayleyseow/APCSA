import java.util.*;
class StartToEnd {
    /* Lower point of a snake or ladder */
    final int lowerPoint;
    /* Upper point of a snake or ladder */
    final int upperPoint;
    /* Whether this object is a snake or a ladder. If this statement is true, object is a ladder. Else, it is a snake. */
    final boolean isLadder;
    /*Initializes StartToEnd instance based on arguments passed into it.*/
    public StartToEnd(int lower, int upper, boolean isL) {
        this.lowerPoint = lower;
        this.upperPoint = upper;
        this.isLadder   = isL;
    }
    /*Returns lowerPoint*/
    public int getLowerPoint(){
        return lowerPoint;
    }
    /* Returns upperPoint */
    public int getUpperPoint(){
        return upperPoint;
    }
    /* Returns isLadder */
    public boolean isThisLadder(){
        return isLadder;
    }
}
class DieRoll {
    /*Mimics 2 die rolls of die from 1-6 and returns sum.*/
    public int getNextNumber(){
        return ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
    }
}
public class SnakesAndLaddersSimulatorAC {

	/* List of snakes and ladders present in game. */
	private static final StartToEnd[] objects = {
			new StartToEnd( 4, 14, true ), new StartToEnd( 7, 17, false), 
			new StartToEnd( 9, 31, true ), new StartToEnd(20, 38, true ),
			new StartToEnd(19, 62, false), new StartToEnd(24, 87, false),
			new StartToEnd(28, 84, true ), new StartToEnd(34, 54, false),
			new StartToEnd(40, 59, true ), new StartToEnd(51, 67, true ),
			new StartToEnd(60, 64, false), new StartToEnd(63, 81, true ),
			new StartToEnd(71, 91, true ), new StartToEnd(73, 93, false),
			new StartToEnd(76, 95, false), new StartToEnd(78, 99, false)
			};

	/*Die instance*/
	private static final DieRoll die = new DieRoll();

	public static void runGame() {
		Scanner input = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		int pturn = 1;
		while (p1 < 100 && p2 < 100) {
			int roll = die.getNextNumber();
			int dir = 0;
			if (pturn == 1) {
				System.out.print("Player 1 turn: ");
				input.nextLine();
				int temp = p1;
				p1 += roll;
				for (StartToEnd o : objects) {
					if (p1 == o.getLowerPoint() && o.isLadder) {
						p1 = o.getUpperPoint();
						dir = 1;
					}
					else if (p1 == o.getUpperPoint() && !o.isLadder) {
						p1 = o.getLowerPoint();
						dir = -1;
					}
				}
				if (roll == 8 || roll == 11) System.out.printf("You roll an %d! Move from %d to %d. ", roll, temp, p1);
				else System.out.printf("You roll a %d! Move from %d to %d. ", roll, temp, p1);
				if (dir == -1) System.out.println("Oh no, you fell down a snake.");
				else if (dir == 1) System.out.println("Yay, you climbed up a ladder.");
				else if (p1 >= 100) System.out.println("You win!");
				else System.out.println();
				pturn = 2;
			} else {
				System.out.print("Player 2 turn: ");
				input.nextLine();
				int temp = p2;
				p2 += roll;
				for (StartToEnd o : objects) {
					if (p2 == o.getLowerPoint() && o.isLadder) {
						p2 = o.getUpperPoint();
						dir = 1;
					}
					else if (p1 == o.getUpperPoint() && !o.isLadder) {
						p2 = o.getLowerPoint();
						dir = -1;
					}
				}
				if (roll == 8 || roll == 11) System.out.printf("You roll an %d! Move from %d to %d. ", roll, temp, p2);
				else System.out.printf("You roll a %d! Move from %d to %d. ", roll, temp, p2);
				if (dir == -1) System.out.println("Oh no, you fell down a snake.");
				else if (dir == 1) System.out.println("Yay, you climbed up a ladder.");
				else if (p2 >= 100) System.out.println("You win!");
				else System.out.println();
				pturn = 1;
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		runGame();
	}

}