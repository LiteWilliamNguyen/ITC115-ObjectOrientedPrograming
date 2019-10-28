import java.util.*;
public class datingProgram {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Location? ");
		String location = console.nextLine();
		
		System.out.print("Height? ");
		int height = console.nextInt();
		
		System.out.print("Salary? ");
		int salary = console.nextInt();
		
		boolean dateTonight = isDate(location, height, salary);
		System.out.println(dateTonight);
		console.close();
	}
	public static boolean isDate(String location, int height, double salary) {
		boolean rich = salary >= 100000.00;
		boolean goodLocation = location.equals("Seattle");
		boolean goodHeight = height > 50 && height < 84;
		
		if ((goodLocation & goodHeight) || rich ) {
			System.out.println("Okay, let's go out!");
			return true;
		} else {
			System.out.println("It's not you, it's me.");
			return false;
		}
		
	}

}
