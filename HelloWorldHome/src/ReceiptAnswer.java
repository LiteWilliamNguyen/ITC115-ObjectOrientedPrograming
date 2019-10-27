import java.text.NumberFormat;

public class ReceiptAnswer {
	
	public static final double TAX = .08; // a constant

	public static void main(String[] args) {
		// Calculate total owed, assuming 8% tax /
		
		calculateBill(150,15);

	}
	public static double calculateBill(double subtotal, double tip) {
		double tax = subtotal * TAX;
		double total = subtotal + tax + tip; 
		
		NumberFormat cf1 = NumberFormat.getCurrencyInstance();
		
		
		System.out.println("Subtotal: " + cf1.format(subtotal));
		System.out.println("Tax: " + cf1.format(tax));
		System.out.println("Tip: " + cf1.format(tip));
		System.out.println("Total: " + cf1.format(total));
		return total;
	}
	
		
	
}
