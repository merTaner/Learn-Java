package methods;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {
		// DRY - Don't repeat yourself

		/*
		 * void function just do it not return
		 * 
		 */
		testFunc();
		String result = testStatic();
		System.out.println(result);
	}

	public static void testFunc() {
		System.out.println("run void function");
	}

	public static String testStatic() {
		return "run static function";
	}

}
