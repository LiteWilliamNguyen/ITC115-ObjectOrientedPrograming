import java.util.*;

/* Write a method called season that takes as parameters two integers 
 * representing a month and day and returns a String indicating the season
for that month and day. Assume that the month is specified as an integer
between 1 and 12 (1 for January, 2 for February, and so on) and that the
day of the month is a number between 1 and 31. If the date falls between
12/16 and 3/15, the method should return "winter". If the date falls
between 3/16 and 6/15, the method should return "spring". If the date
falls between 6/16 and 9/15, the method should return "summer". And if
the date falls between 9/16 and 12/15, the method should return "fall".
 * 
 */

public class Assignment5 {

	public static void main(String[] args) {
		season();
		printGPA();

	}
	public static void season() {
		Scanner console = new Scanner(System.in);
		System.out.println("This method will find out the season based on the date being enter.");
		System.out.println("Please enter in the Month(number): ");
		int month = console.nextInt();
		System.out.println("Please enter in the day: ");
		int day = console.nextInt();
		
		if ((month > 0 && month <= 12) && (day > 0 && day <=31)){
			if ((month == 12 && day >= 16) || (month <= 3 && day <= 15)) {
				System.out.println("winter");
			}
			else if((month >= 3 && day >= 16) || (month <= 6 && day <= 15)) {
				System.out.println("spring");
			}
			else if((month >= 6 && day >= 16) || (month <= 9 && day <= 15)) {
				System.out.println("summer");
			}
			else if((month >= 9 && day >= 16) || (month <= 12 && day <= 15)) {
				System.out.println("fall");
			}
		}
		else {
			System.out.println("Error! Please reenter the Month and Date");
			season();
		}
		
		console.close();
	}
	
	/*
	 * Write a method called printGPA that accepts a Scanner for the console
	as a parameter and calculates a student's grade point average. The user
	will type a line of input containing the student's name, then a number
	that represents the number of scores, followed by that many integer
	scores. Here are two example dialogues:
	Enter a student record: Maria 5 72 91 84 89 78
	Maria's grade is 82.8
	Enter a student record: Jordan 4 86 71 62 90
	Jordan's grade is 77.25
	Maria's grade is 82.8 because her average of (72 + 91 + 84 +
	 */
	
	public static void printGPA() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a student record: ");
		String name  = console.next();
		int numScore = console.nextInt();
		double sum = 0.0;
		
		for(int i = 0; i < numScore; i++) {
			int score = console.nextInt();
			sum+= score;
		}
		double average = sum / numScore;
		System.out.println(name + "'s grade is " + average);
		
		console.close();
	}
}
