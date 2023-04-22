package groceryProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double armut, elma, domates, muz, patlýcan, total;
		
		System.out.print("Armut Kaç kilo ? :");
		double armutKG = scanner.nextDouble();
		armut = 2.14 * armutKG;
		
		System.out.print("Elma Kaç kilo ? :");
		double elmaKG = scanner.nextDouble();
		elma = 2.14 * elmaKG;

		System.out.print("Domates Kaç kilo ? :");
		double domatesKG = scanner.nextDouble();
		domates = 2.14 * domatesKG;

		System.out.print("Muz Kaç kilo ? :");
		double muzKG = scanner.nextDouble();
		muz = 2.14 * muzKG;
		
		System.out.print("Patlýcan Kaç kilo ? :");
		double patlýcanKG = scanner.nextDouble();
		patlýcan = 2.14 * patlýcanKG;
		
		total = armut + elma + domates + muz + patlýcan;
		
		System.out.println("Total price : " + total);
	}

}
