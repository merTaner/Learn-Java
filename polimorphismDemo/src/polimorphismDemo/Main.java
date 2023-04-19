package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] baseCreditManager = new BaseCreditManager[] {new TeacherCredit(), 
				new FarmerCredit(), new StudentCredit()};
		
		for (BaseCreditManager creditOfEverone : baseCreditManager) {
			System.out.println(creditOfEverone.calculate(2000));
		}
	}

}
