package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlDatabase());
		customerManager.add();
	}

}
