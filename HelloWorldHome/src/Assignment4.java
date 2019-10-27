
public class Assignment4 {

	public static void main(String[] args) {
		/*Write a method called repl that accepts a String and a number of
		repetitions as parameters and returns the String concatenated that many
		times. For example, the call repl("hello", 3) should return
		"hellohellohello". If the number of repetitions is zero or less, the
		method should return an empty string. */
		
		repl("hello",3);

	}
	public static void repl(String string, int count) {
	for (int i = 1; i <= count; i++) {
		  System.out.print(string);
		  }
		  System.out.println();
		  }
}



