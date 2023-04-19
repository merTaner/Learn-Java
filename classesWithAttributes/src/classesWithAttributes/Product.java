package classesWithAttributes;

public class Product {
	// attribute or field of products\
	// single responsibility
	
	public Product () {
		// default constructer
		// first this block run
		// like __init__ from python 
	}
	
	public Product (int id, String name, String describtion, double price, String productCode) {
		// constructer with parameter 
		this.id = id;
		this.name = name;
		this.describtion = describtion;
		this.price = price;
		this.productCode = productCode;
	}
	
	int id;
	String name;
	String describtion;
	double price; 
	String productCode;
	
	//encapsulation 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescribtion() {
		return describtion;
	}
	
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductCode() {
		return this.name.substring(0, 1) + this.id;
	}
	
	
	
}
