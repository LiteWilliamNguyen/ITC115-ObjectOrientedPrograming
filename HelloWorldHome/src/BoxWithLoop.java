
public class BoxWithLoop {

	public static void main(String[] args) {
		//prints several lines and boxes made of stars.
		//Third version with multiple parameterized methods
		line(13);
		line(7);
		line(35);
		System.out.println();
		box(10,3);
		box(5,4);
		box(20,7);

	}
	//prints the given number of stars plus a line break
	public static void line(int count) {
		for(int i=1;i<=count;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//print a box of stars of the given size
	public static void box(int width, int height) {
		line(width);
		for(int line=1;line <=height -2; line++) {
			System.out.print("*");
			for(int space=1;space <= width -2; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		line(width);
	}
	

}
