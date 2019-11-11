//prints out a time capsule
public class TimeCapsule {
	public static final int HEIGHT = 3;
	public static void top(){
		for (int i=0;i <HEIGHT; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for (int i=0; i <HEIGHT; i++) {
			for (int j = 0; j < HEIGHT - (i + 1); j++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j=0; j < 2 * i + 1; j++) {
				System.out.print("o");
			}
			System.out.print("\\");
			System.out.println();
		}
	}
	public static void middle() {
        System.out.print("|");
        for (int i = 0; i < 2 * HEIGHT - 1; i++) {
            System.out.print("@");
        }
        System.out.println("|");
        for (int i = 0; i < 2* HEIGHT - 3; i++) {
            System.out.print("|@");
            for (int j = 0; j < 2 * HEIGHT - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("@|");
        }
        System.out.print("|");
        for (int i = 0; i < 2 * HEIGHT - 1; i++) {
            System.out.print("@");
        }
        System.out.println("|");
    }
    public static void bottom() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 0; j < (2 * (HEIGHT - i)) - 1; j++) {
                System.out.print("o");
            }
            System.out.println("/");
        }
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
	public static void main(String[] args) {
		top();
		middle();
		bottom();
	}		
}
	
