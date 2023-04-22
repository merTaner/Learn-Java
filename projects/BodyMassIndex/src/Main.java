import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome calculate body mass index");
		
		System.out.print("Enter the length : ");
		Scanner scanner = new Scanner(System.in);
		double lenght =  scanner.nextDouble();
		
		System.out.println("Enter the weight :");
		double weight = scanner.nextDouble();
		
		double calculateResult = weight / (lenght * lenght);
		System.out.println("Your result : " + calculateResult);
		
		scanner.close();
	}

}
