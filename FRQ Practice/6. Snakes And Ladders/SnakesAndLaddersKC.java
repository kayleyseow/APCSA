/* Random.random() returns a value between 0 (inclusive) and 1 (exclusive) */
import java.util.Random;
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
    public int getLowerPoint()
    {
    	return lowerPoint; 
    }

    /* Returns upperPoint */
    public int getUpperPoint()
    {
    	return upperPoint; 
    }

    /* Returns isLadder */
    public boolean isThisLadder()
    {
    	return isLadder; 
    }

}

class DieRoll {

    /*Mimics 2 die rolls of die from 1-6 and returns sum.*/
    public int getNextNumber()
    {
    	Random rand = new Random(); 
    	return (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1); 
    }
}

public class SnakesAndLaddersKC {

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

/*
Run game of snakes and ladders. Have 2 players and allow players to give input to do the next turn. State which player's turn it is.

For example, a turn may be as follows:
    Player 1 turn:
        (waits for user to click enter)
        You roll an 8! Move from 87 to 95. Oh no, you fall down a snake.
    Player 2 turn:
        (waits for user to click enter)
        You roll a 12. Move from 92 to 102. You win!
*/
    public static void runGame()
    {
    	Scanner console = new Scanner(System.in); 
    	boolean gameEnd = false; 
    	int[] current = {1, 1}; 
    	
    	while (gameEnd != true) {
    		for (int i = 0; i < 2; i++) {
    			System.out.println("Player " + (i + 1) + " turn:");
    			System.out.println("Enter \"roll\" to roll."); 
    			console.next(); 
    			int roll = die.getNextNumber(); 
    			System.out.print("You roll a " + roll + "! "); 
    			System.out.println("Move from " + current[i] + " to " + (current[i] + roll) + ". ");
    			current[i] = current[i] + roll; 
    			for (int j = 0; j < objects.length; j++) {
    				if (objects[j].getLowerPoint() == current[i] && objects[j].isThisLadder() == true) {
    					current[i] = objects[j].getUpperPoint();
    					System.out.println("Yay, you climb up a ladder. Move to " + current[i] + ".");
    					break; 
    				}
    				else if (objects[j].getUpperPoint() == current[i] && objects[j].isThisLadder() == false) {
    					current[i] = objects[j].getLowerPoint();
    					System.out.println("Oh no, you fall down a snake. Move to " + current[i] + ".");
    					break; 
    				}
    			}
    			if (current[i] >= 100) {
    				System.out.println("You win!"); 
    				gameEnd = true; 
    				break; 
    			}
    			System.out.println(); 
    		}
    	}
    }

    public static void main(String[] args)
    {
    	runGame(); 
    }

}
