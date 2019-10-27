
public class DuplicatingWithLoop {
	
	public static final int DAYS_IN_WEEK = 7;
	public static final double INTEREST_RATE = 3.5;
	public static final int SSN = 123456789;
	
	public static void main(String[] args) {
		//
		missileCountDown();
		line(6);
		box(10,3);
		printNumber(12);
	}
	
	public static void missileCountDown() {
		System.out.println("T-minus ");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.println("ignited \nand blastoff!!");
	}
	//creating a line
	public static void line(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//creating a box
	public static void box(int width, int height) {
		line(width);
		for (int line = 1; line <= height - 2; line++) {
			System.out.print("*");
			for (int space = 1; space <= width - 2; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		line(width);
	}
	//print number in bracket
	public static void printNumber(int max) {
		for(int i = 1; i <= max; i++) {
			System.out.print("["+i+"]");
		}
		System.out.println(); // end the line of output
	}
	
}
