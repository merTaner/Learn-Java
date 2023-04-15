package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] carts = new String[2];
		// other way definition array { "cart 1", "cart 2" }
		carts[0] = "cart 1";
		carts[1] = "cart 2";

		// refactoring code
		for (String cart : carts) {
			System.out.println(cart);
		}
	}

}
