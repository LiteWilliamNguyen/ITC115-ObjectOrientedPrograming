import java.util.Scanner;
public class scannerMethod {

	public static void main(String[] args) {
		retireAge();
		gpaScanner();
		gradeScanner();
		findNumbers2();
	}
	
	public static void retireAge() {
	//create the scanner object
	
			Scanner console = new Scanner(System.in);
			
			System.out.print("How old are you? ");
			int age = console.nextInt();
			System.out.println("You typed " + age);
			int years = 65 - age;
			System.out.println(years + " years to retirement!");
			console.close();
	}
	
	public static void gpaScanner() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter GPA: ");
		double gpa = console.nextDouble();
		if (gpa >= 2.0) {
			System.out.println("Application accepted.");
			} else {
				System.out.println("Application denied");
			}
		System.out.println("After the if statement");
		console.close();
	}
	
	public static void gradeScanner() {
		Scanner console = new Scanner(System.in);
		System.out.println("What percentage did you earn? ");
		int percent = console.nextInt();
		
		if (percent >= 90) {
			System.out.println("You got an A!");
		}
		else if (percent >= 80) {
			System.out.println("You got a B!");
		}
		else if (percent >= 70) {
			System.out.println("You got a C!");
		}
		else if (percent >= 60) {
			System.out.println("You got a D!");
		}
		else {
			System.out.println("You got an F!");
			}
		console.close();
		}
	/* Finds the average of a sequence of numbers as well as
	 * reporting how many of the numbers were negative.
	 */
	public static void findNumbers2() {
		System.out.println("This program examines a sequence" + 
						   "/nof numbers to find the average" + 
						   "/nand count how many are negative.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you have? ");
		int totalNumber = console.nextInt();
		
		int negative = 0;
		double sum = 0.0;
		for (int i = 1; i <= totalNumber; i++) {
			System.out.print("   #" + i+ "? ");
			double next = console.nextDouble();
			sum+= next;
			System.out.println("Next is " + next);
			System.out.println("Sum is " + sum);
			if (next < 0) {
				negative++;
			}}
		System.out.println();
		if (totalNumber <= 0) {
			System.out.println("No numbers to average");
		} else {
			double average = sum/totalNumber;
			System.out.println("average = " + average);
		}
		System.out.println("# of negatives = " + negative);
		
		
		console.close();
	}

}
