package calculateHypotenuse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// first step definition variable
		int a, b;
		double c;
		
		// second step take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		
		System.out.print("Enter b : ");
		b = input.nextInt();
		
		// Calculate result with Math.sqrt
		c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Result : " + c);
		
		input.close();
	}

}
