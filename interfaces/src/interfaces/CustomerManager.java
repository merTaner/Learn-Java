package interfaces;

public class CustomerManager {
	
	ICustomerDal �coCustomerDal;
	
	public CustomerManager (ICustomerDal �coCustomerDal) {
		this.�coCustomerDal = �coCustomerDal;
	}
	
	public void add() {
		�coCustomerDal.add();
	}
}
