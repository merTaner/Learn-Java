package perfectNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// perfect number example 6 = 1+2+3
		int number = 6;
		int total = 0;
		
		for (int i=1; i < number; i++) {
			if (number % i == 0) {
				total += i;	
			}
		}
		
		if (total != number) {
			System.out.println("not perfect number");
		}
		else {
			System.out.println(number+" is a perfect number. Value : " + total);
		}
		
		
	}

}
