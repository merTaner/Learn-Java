package taximeter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome Taximeter System");
		System.out.println("Taksimetre açýlýþ fiyatý : 10TL");
		
		System.out.print("Kaç km yol gideceksiniz : ");
		Scanner scanner = new Scanner(System.in);
		int gidilenKMYol = scanner.nextInt();
		
		double tutar = 10;
		for (int km = 1; km < gidilenKMYol+1 ;km++) {
			System.out.println("Gidilne yol : " + km);
			tutar += km * 2.20;
			System.out.println("Güncel Tutar : " + tutar);
		}
		
		if (tutar < 20) {
			System.out.println("Minimum tutar 20 TL'dir.");
			tutar = 20;
			System.out.println("Borcunuz : " + tutar);
		}else {
			System.out.println("Borcunuz : " + tutar);
		}
		
		scanner.close();

	}

}
