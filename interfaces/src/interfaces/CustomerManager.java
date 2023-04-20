package interfaces;

public class CustomerManager {
	
	ICustomerDal ýcoCustomerDal;
	
	public CustomerManager (ICustomerDal ýcoCustomerDal) {
		this.ýcoCustomerDal = ýcoCustomerDal;
	}
	
	public void add() {
		ýcoCustomerDal.add();
	}
}
