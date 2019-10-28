
public class sampleMathClass {

	public static void main(String[] args) {
		// 
		powerOf2(8);
		squareRoot(6);
		
		System.out.println(largerAbsVal(-4,5,2));
		
		System.out.println("The slope is " + slope(1,2,3,4));
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
	
	public static int largerAbsVal(int n1, int n2, int n3) {
		int larger12= Math.max(Math.abs(n1),Math.abs(n2));
		int larger23= Math.max(Math.abs(n2), Math.abs(n3));
		return Math.max(larger12,larger23);
	}
	
	public static double slope(int x1, int x2, int y1, int y2) {
		double dy= y2-y1;
		double dx= x2-x1;
		return dy/dx;
		
	}
}
