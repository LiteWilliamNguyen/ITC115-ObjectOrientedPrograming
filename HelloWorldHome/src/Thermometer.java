
public class Thermometer {

	public static void main(String[] args) {
		
		System.out.println(fToC(110.0));
	}
	
	public static double fToC(double degreesF) {
		double degreesC = 5.0/9.0 * (degreesF - 32);
		return degreesC;
	}
	
	public static double cToF(double degreesC) {
		return degreesC * 9.0/5.0 + 32;
		
	}
	
	
}
