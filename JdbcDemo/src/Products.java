
public class Products {
	private int product_id;
	private int uom_id;
	private String name;
	private double unit_price;
	
	public Products(int product_id, int uom_id, String name, double unit_price) {
		this.product_id = product_id;
		this.uom_id = uom_id;
		this.name = name;
		this.unit_price = unit_price;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUom_id() {
		return uom_id;
	}
	public void setUom_id(int uom_id) {
		this.uom_id = uom_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
	
	
}
