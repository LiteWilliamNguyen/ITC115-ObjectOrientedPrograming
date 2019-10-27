
public class Assignment3 {

	public static void main(String[] args) {
		printPowersOfN(2,7); 
		printPowersOfN(5,3);
		System.out.println("\"");
		
	}
	public static void printPowersOfN(int count, int power) {
		for(int i=0; i <= power; i++) {
			System.out.print((int)Math.pow(count,i) + " ");
		}
		System.out.println();
	}
	

}
