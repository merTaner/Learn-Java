package polimorphismDemo;

public class BaseCreditManager {
	public double calculate(double amount) {
		return amount * 1.27;
	}
	
	// if you want disable for overwriting add prefix final in method
	/*
		 public double final calculate(double amount) {
			return amount * 1.27;
		}
	 */
}
