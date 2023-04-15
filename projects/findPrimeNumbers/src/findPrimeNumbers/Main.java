package findPrimeNumbers;

public class Main {

	public static void main(String[] args) {
		// project 01 - find prime number
		int number = 10;
		boolean isPrime = true;
		
		for (int i=2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime);
		

	}

}
