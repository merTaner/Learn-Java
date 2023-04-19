package polimorphismDemo;

public class StudentCredit extends BaseCreditManager{
	// overwriting the base class
	public double calculate(double amount) {
		return amount * 1.1;
	}
}
