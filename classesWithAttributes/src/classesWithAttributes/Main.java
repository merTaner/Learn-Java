package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		product product1 = new product();
		product1.name = "Monster";
		product1.price = 17.000;
		
		
		productManager productManager = new productManager();
		productManager.add(product1);

		System.out.println(product1.getProductCode());
	}

}
