
public class baking {

	public static void main(String[] args) {
		// 
		mixCookies(60);
		bakeCookies();
		decorateCookies();
		coolCookies(60);
		System.out.println();
	}
	//mix ingredients
	public static void mixCookies(int numberCookies) {
		
		System.out.println("Gather wet ingredients");
		System.out.println("Number eggs needed " + numberCookies/10);
		System.out.println("Gather dry ingredients");
		System.out.println("Cup flour " + numberCookies/5);
		System.out.println("Cup sugar "+ numberCookies/20);
		System.out.println("Combine ingredients");
	}
	//bake cookies
	public static void bakeCookies() {
		System.out.println("Set the oven temperature");
		System.out.println("Set the timers.");
		System.out.println("Place a batch of cookies into the oven.");
		System.out.println("Allow the cookies to bake.");
	}
	//cool cookies
	public static void coolCookies(int numberCookies) {
		System.out.println("Cooling cookies " + numberCookies + " cookies. \nAlmost ready to eat!");
	}
	//decorate
	public static void decorateCookies() {
		System.out.println("Spread frosting and sprinkles.");
	}

}
