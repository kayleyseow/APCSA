import java.util.Scanner;
import java.util.Random;
    
class StartToEnd {
    /* Lower point of a snake or ladder */
    final int lowerPoint;
    /* Upper point of a snake or ladder */
    final int upperPoint;
    /* Whether this object is a snake or a ladder. If this statement is true, object is a ladder. Else, it is a snake. */
    final boolean isLadder;

    public StartToEnd(int lower, int upper, boolean isL) {
        this.lowerPoint = lower;
        this.upperPoint = upper;
        this.isLadder   = isL;
    }

    public int getLowerPoint() {
        return lowerPoint;
    }

    public int getUpperPoint() {
        return upperPoint;
    }

    public boolean isThisLadder() {
        return isLadder;
    }

}

class DieRoll {
    public int getNextNumber() { 
        int roll1 = (int)(Math.random()*6)+1;
        int roll2 = (int)(Math.random()*6)+1;
        return roll1 + roll2;
    }
}

public class SnakesAndLaddersSimulatorCT {

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

    private static final DieRoll die = new DieRoll();
    private static Scanner sc = new Scanner(System.in);
    public static void runGame() {
        String name1, name2;
        System.out.println("Starting game ...");
        System.out.println("Player 1, enter your name: ");
        name1 = sc.next();
        System.out.println("Player 2, enter your name: ");
        name2 = sc.next();
        int pos1 = 0;
        int pos2 = 0;
        while (true) {
            pos1 = moveTo(name1, pos1); 
            if (pos1 > 100) {
                System.out.println(name1 + " won!");
                break;
            }
            pos2 = moveTo(name2, pos2);
            if (pos2 > 100) {
                System.out.println(name2 + " won!");
                break;
            }
        }
    }
    public static int moveTo(String name, int pos) {
        int roll;
        System.out.print(name + "'s Turn. Type ENTER to roll the die ");
        String input = sc.next();
        roll = die.getNextNumber();
        System.out.println(name + " rolled a " + roll);
        System.out.println("Move from " + pos + " to " + (pos + roll));
        pos += roll;
        for (StartToEnd s : objects) {
            if (pos == s.getLowerPoint() && s.isThisLadder()) {
                pos = s.getUpperPoint();
                System.out.println(name + " climbed up the ladder to " + pos);
                break;
            }
            if (pos == s.getUpperPoint() && !s.isThisLadder()) {
                pos = s.getLowerPoint();
                System.out.println(name + " slid down the snake to " + pos);
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        runGame();
    }

}
