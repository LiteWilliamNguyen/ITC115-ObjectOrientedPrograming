
public class HelloWorld {

	public static void main(String[] args) {
		// Homework 2
		printLine();
		
		int n1=0, n2=1, n3=1, a, count=12;
		System.out.println(n1 + "\n" + n2);
		for(a=2; a<count; ++a)
		{n3=n1+n2;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;}
	}
	public static void printLine() {
		System.out.println("A well-formed Java program has \n"
						+  "a main method with { and } \n" +
						   "braces.\n"+
						   "A System.out.println statement\n"+
						   "has ( and ) and usually a\n"+
						   "String that starts and ends\n"+
						   "with a \" character.\n"+
						   "(But we type \\\" instead!)"
				);		
	}
	public static void printFibonacciNumber(int number) {
		
		
		
	}
}
