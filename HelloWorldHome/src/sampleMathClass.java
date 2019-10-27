
public class sampleMathClass {

	public static void main(String[] args) {
		// 
		powerOf2(8);
		squareRoot(6);
	}
	
	public static void powerOf2(int max) {
		for(int i = 1; i <= max; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
		System.out.println();
	}
	
	public static void squareRoot(int max) {
		for (int i = 1; i <= max; i++) {
			double root = Math.sqrt(i);
			System.out.println("square root of "+ i + ") =" + root);
		}
	}
}
