package groceryProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double armut, elma, domates, muz, patl�can, total;
		
		System.out.print("Armut Ka� kilo ? :");
		double armutKG = scanner.nextDouble();
		armut = 2.14 * armutKG;
		
		System.out.print("Elma Ka� kilo ? :");
		double elmaKG = scanner.nextDouble();
		elma = 2.14 * elmaKG;

		System.out.print("Domates Ka� kilo ? :");
		double domatesKG = scanner.nextDouble();
		domates = 2.14 * domatesKG;

		System.out.print("Muz Ka� kilo ? :");
		double muzKG = scanner.nextDouble();
		muz = 2.14 * muzKG;
		
		System.out.print("Patl�can Ka� kilo ? :");
		double patl�canKG = scanner.nextDouble();
		patl�can = 2.14 * patl�canKG;
		
		total = armut + elma + domates + muz + patl�can;
		
		System.out.println("Total price : " + total);
	}

}
